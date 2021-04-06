package BasicConcepts;

import java.util.Scanner;
public class TiimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        int result = days*24*60*60;
        System.out.println(result);
    }
}
