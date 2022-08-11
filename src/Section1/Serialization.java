package Section1;

import java.io.Serializable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;


class Persons implements Serializable {

    private static final long serialVersionUID = 4801633306273802062L;

    private int id;
    private String name;

    public Persons(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }
}
class WriteObjects {

    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Persons mike = new Persons(543, "Mike");
        Persons sue = new Persons(123, "Sue");

        System.out.println(mike);
        System.out.println(sue);

        try (FileOutputStream fs = new FileOutputStream("people.bin")) {

            ObjectOutputStream os = new ObjectOutputStream(fs);

            os.writeObject(mike);
            os.writeObject(sue);

            os.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    class ReadObjects {


        public static void main(String[] args) {
            System.out.println("Reading objects...");

            try (FileInputStream fi = new FileInputStream("people.bin")) {

                ObjectInputStream os = new ObjectInputStream(fi);

                Person person1 = (Person) os.readObject();
                Person person2 = (Person) os.readObject();

                os.close();

                System.out.println(person1);
                System.out.println(person2);

            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}





