package ClassesAndObjects;

import java.util.Scanner;
class BianryConverter {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}
class Converter {
    public static String toBinary(int num) {
        StringBuilder binary = new StringBuilder();
        while(num > 0) {
            binary.insert(0, (num % 2));
            num /= 2;
        }
        return binary.toString();
    }
}