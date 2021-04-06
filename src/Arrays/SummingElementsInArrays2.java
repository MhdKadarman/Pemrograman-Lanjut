package Arrays;

public class SummingElementsInArrays2 {
    public static void main(String[] args) {
        double myArr[] = {2.5, 4.1, 18.1, 22.3};
        double sum = 0.0;
        for (int x = 0; x < 4; x++) {
            sum += myArr[x];
        }
        System.out.println(sum);
    }
}
