package ConditionalsAndLoops;

public class ExampleElseIfStatement {
    public static void main(String[] args) {
        int age = 25;

        if (age <= 0) {
            System.out.println("Error");
        } else if (age <= 16) {
            System.out.println("Too young");
        } else if (age < 100) {
            System.out.println("Welcome");
        } else {
            System.out.println("Really?");
        }
    }
}
