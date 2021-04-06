package MoreOnClasses;

public class PolymorphismContoh {
    public void makeSound() {
        System.out.println("Grr...");
    }
}
class Kucing extends PolymorphismContoh {
    public void makeSound() {
        System.out.println("Meow");
    }
}
class Anjing extends PolymorphismContoh {
    public void makeSound() {
        System.out.println("Woof");
    }
}