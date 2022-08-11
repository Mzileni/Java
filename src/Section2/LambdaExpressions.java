package Section2;

interface Executable {

    //void execute();
   // int execute();
    int execute(int a, int b);

}

class Runner {
    public void run(Executable e) {
        //e.execute();
        int value = e.execute(1 , 2);
        System.out.println("Return value is: " + value);
    }
}

public class LambdaExpressions {
    public static void main(String[] args) {

    //Basic Lambda Expressions
  /*  Runner runner = new Runner();
    runner.run( () -> System.out.println("Hello nizo.") );
     runner.run( () -> {
        System.out.println("Hello there.");
        System.out.println("And hello again.");

});*/

     //Return Values in Lambda Expressions
     /*   Runner runner = new Runner();
        runner.run(new Executable() {
            public int execute() {
                System.out.println("Hello there.");
                System.out.println("And hello again.");
                return 7;

            }
        });*/
        Runner runner = new Runner();
        // Anonymous class
        runner.run(new Executable() {
            public int execute(int a, int b) {
                System.out.println("Hello there.");
                System.out.println("And hello again.");
                return a + b;
            }
        });

        // Lambda expression
        runner.run( (a, b) -> {
            System.out.println("Hello there.");
            System.out.println("And hello again.");
            return a + b;
        });
    }
}