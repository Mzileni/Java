package Section1;

abstract class Machined {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start();
    public abstract void doStuff();
    public abstract void shutdown();

    public void run() {
        start();
        doStuff();
        shutdown();
    }
}
class Camera extends Machined {

    @Override
    public void start() {
        System.out.println("Starting camera.");
    }

    @Override
    public void doStuff() {
        System.out.println("Taking a photo");

    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down the camera.");

    }

}
class Cars extends Machined {

    @Override
    public void start() {
        System.out.println("Starting ignition...");

    }

    @Override
    public void doStuff() {
        System.out.println("Driving...");
    }

    @Override
    public void shutdown() {
        System.out.println("Switch off ignition.");

    }

}
public class AbstractClasses {
    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setId(5);

        Cars car1 = new Cars();
        car1.setId(4);

        car1.run();

        //Machine machine1 = new Machine();
    }
}
