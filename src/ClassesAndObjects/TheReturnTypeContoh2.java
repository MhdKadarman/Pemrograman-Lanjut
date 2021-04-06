package ClassesAndObjects;


public class TheReturnTypeContoh2 {
    static int returnFive() {
        return 5;
    }
    static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }
    static void sayHello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        sayHello();
        sayHelloTo("Maman");
    }
}
