package Pattern;

public class HalfPyramid {
    public static void main(String[] args) {
        int n = 6;
        int pointer = n;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {

                System.out.print("x");
            }
            System.out.println();
        }
    }
}
