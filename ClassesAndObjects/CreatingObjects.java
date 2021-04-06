package ClassesAndObjects;

public class CreatingObjects {
    public void test() {
        System.out.println("Hi");
    }
}
class B {
    public static void main(String[] args) {
        CreatingObjects obj = new CreatingObjects();
        obj.test();
    }
}
