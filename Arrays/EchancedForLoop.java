package Arrays;

public class EchancedForLoop {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, 7};
        int total = 0;
        for (int x : arr) {
            total += x;
            System.out.println(x);
        }
    }
}
