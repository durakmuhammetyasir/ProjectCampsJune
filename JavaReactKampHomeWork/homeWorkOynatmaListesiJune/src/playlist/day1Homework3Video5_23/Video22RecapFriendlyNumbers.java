package playlist.day1Homework3Video5_23;

public class Video22RecapFriendlyNumbers {

    // Returns sum of all factors of n.
    static int sumofFactors(int n)
    {

        // Traversing through all prime factors.
        int res = 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {

            int count = 0, curr_sum = 1;
            int curr_term = 1;
            while (n % i == 0) {
                count++;

                // THE BELOW STATEMENT MAKES
                // IT BETTER THAN ABOVE METHOD
                // AS WE REDUCE VALUE OF n.
                n = n / i;

                curr_term *= i;
                curr_sum += curr_term;
            }

            res *= curr_sum;
        }

        // This condition is to handle
        // the case when n is a prime
        // number greater than 2.
        if (n >= 2)
            res *= (1 + n);

        return res;
    }

    // Function to return gcd of a and b
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    // Function to check if the given two
    // number are friendly pair or not.
    static boolean checkFriendly(int n, int m)
    {
        // Finding the sum of factors of n and m
        int sumFactors_n = sumofFactors(n);
        int sumFactors_m = sumofFactors(m);

        // finding gcd of n and sum of its factors.
        int gcd_n = gcd(n, sumFactors_n);

        // findig gcd of m and sum of its factors.
        int gcd_m = gcd(m, sumFactors_m);

        // checking is numerator and denominator of
        // abundancy index of both number are equal
        // or not.
        if (n / gcd_n == m / gcd_m &&
                sumFactors_n / gcd_n == sumFactors_m / gcd_m)
            return true;

        else
            return false;
    }

    //driver code
    public static void main (String[] args)
    {
        int n = 28, m = 6;

        if(checkFriendly(n, m))
            System.out.print("Yes\n");
        else
            System.out.print("No\n");
    }
}
