
public class LarNumArr {

    static int largeNum(int[] x) {
        int max = x[0];
        for (int i = 1; i < (x.length); i++) {
            if (x[i] > max) {
                max = x[i];

            }

        }

        return (max);

    }

    public static void main(String[] args) {
        int[] x = {1, 2, 100, 4, 5, 7, 9};

        System.out.println(largeNum(x));

    }
}
