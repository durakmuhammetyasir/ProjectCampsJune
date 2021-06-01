package playlist.day1Homework3Video5_23;

import java.util.Iterator;

public class Video19RecapFirstNPrimes implements Iterator<Integer> {
    public static void main(String[] args){
        Iterator<Integer> iter = new Video19RecapFirstNPrimes(52);
        while (iter.hasNext()) {
            int p = iter.next();
            System.out.println(p);
        }
    }
    private int current = 1;
    private int howmany;
    private int count = 0;
    public Video19RecapFirstNPrimes(int howmany) {
        this.howmany = howmany;
    }
    public boolean hasNext() {
        return count < howmany;
    }
    public Integer next() {
        current++;
        while (!isPrime(current)) // Loop until
            current++; // you find a prime.
        count++;
        return current;
    }
    private boolean isPrime(int n) {
        for (int i=2; i*i<=n; i++)
            if (n%i == 0)
                return false;
        return true;
    }
}