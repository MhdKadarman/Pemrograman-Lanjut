package MoreOnClasses;

public class PolymorphismContohRun {
    public static void main(String[] args) {
        PolymorphismContoh a = new Anjing();
        PolymorphismContoh b = new Kucing();
        a.makeSound();
        b.makeSound();
    }
}
