package ClassesAndObjects;

public class ValueTypesSoal {
    public static void main(String[] args) {
        int x = 4;
        square(x);
        System.out.println(x);
    }
    static void square(int x) {
        x = x*x;
    }
}
