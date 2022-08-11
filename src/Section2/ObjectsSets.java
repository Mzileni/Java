package Section2;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
class Human {
    private int id;
    private String name;

    public Human(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "{ID is: " + id + "; name is: " + name + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
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
        final Human other = (Human) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }


}
public class ObjectsSets {
    public static void main(String[] args) {
        Human p1 = new Human(0, "Bob");
        Human p2 = new Human(1, "Sue");
        Human p3 = new Human(2, "Mike");
        Human p4 = new Human(1, "Sue");

        Map<Human, Integer> map = new LinkedHashMap<Human, Integer>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 1);

        for(Human key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        Set<Human> set = new LinkedHashSet<Human>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);
    }

}

