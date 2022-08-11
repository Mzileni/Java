package Section1;

import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
class Personn implements Serializable {

    private static final long serialVersionUID = -1150098568783815480L;

    private transient int id;
    private String name;

    private static int count;

    public Personn() {
        System.out.println("Default constructor");
    }

    public Personn(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("Two-argument constructor");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Personn.count = count;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "] Count is: " + count;
    }
}
public class Transient {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("test.ser"))) {

            Personn person = new Personn(7, "Bob");
            Personn.setCount(88);
            os.writeObject(person);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
