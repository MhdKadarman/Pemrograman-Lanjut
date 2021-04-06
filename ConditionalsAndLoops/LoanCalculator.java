package ConditionalsAndLoops;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int rem_amt = amount;
        for (int i =1; i <= 3; i++) {
            int paid = (int)Math.ceil(10/100.0*rem_amt);
            rem_amt -= paid;
        }
        System.out.println(rem_amt);
    }
}
