package Section1;

class Frogs {

    private int id;
    private String name;

    public Frogs(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {

        return String.format("%-4d: %s", id, name);

        /*
        StringBuilder sb = new StringBuilder();
        sb.append(id).append(": ").append(name);

        return sb.toString();
        */
    }
}
public class ToString {
    public static void main(String[] args) {
        Frogs frog1 = new Frogs(7, "Freddy");
        Frogs frog2 = new Frogs(5, "Roger");

        System.out.println(frog1);
        System.out.println(frog2);
    }
}
