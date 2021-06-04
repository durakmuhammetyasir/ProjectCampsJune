package playlist2.day2Homework2Video24_35.Video26VarargsMax;

public class MaxVarargs {
    public static int max(int n1, int n2, int... num) {
        // Initialize max to the maximum of n1 and n2
        int max = (n1 > n2 ? n1 : n2);
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        return max;
    }
}
