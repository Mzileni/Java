package Section2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class User implements Comparable<User> {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final User other = (User) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(User person) {
        int len1 = name.length();
        int len2 = person.name.length();

        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        else {
            return name.compareTo(person.name);
        }
    }
}
public class NaturalOrdering {
    public static void main(String[] args) {
        List<User> list = new ArrayList<User>();
        SortedSet<User> set = new TreeSet<User>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        showElements(list);
        System.out.println();
        showElements(set);
    }

    private static void addElements(Collection<User> col) {
        col.add(new User("Joe"));
        col.add(new User("Sue"));
        col.add(new User("Juliet"));
        col.add(new User("Clare"));
        col.add(new User("Mike"));
    }

    private static void showElements(Collection<User> col) {
        for(User element: col) {
            System.out.println(element);
        }
    }
}
