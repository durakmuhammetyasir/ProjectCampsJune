package playlist2.day2Homework2Video24_35.Video29Types;

import java.util.Arrays;

import static playlist2.day2Homework2Video24_35.Video29Types.ArrayFunctionsToCopy.expandArray;
import static playlist2.day2Homework2Video24_35.Video29Types.ArrayFunctionsToCopy.printArrays;

public class Video29TypesReference {
    public static void main(String[] args) {
        // Have an array with 5 elements
        int[] data = {1, 2, 3, 4, 5};
        // Expand the data array to 7 elements
        int[] eData = expandArray(data, 7);
        // Truncate the data array to 3 elements
        int[] tData = expandArray(data, 3);
        System.out.println("Using for-loop...");
        printArrays(data, eData, tData);
        /* Using System.arraycopy() method */
        // Copy data array to new arrays
        eData = new int[7];
        tData = new int[3];
        System.arraycopy(data, 0, eData, 0, 5);
        System.arraycopy(data, 0, tData, 0, 3);
        System.out.println("\nUsing System.arraycopy() method...");
        printArrays(data, eData, tData);
        /* Using Arrays.copyOf() method */
        // Copy data array to new arrays
        eData = Arrays.copyOf(data, 7);
        tData = Arrays.copyOf(data, 3);
        System.out.println("\nUsing Arrays.copyOf() method...");
        printArrays(data, eData, tData);
        /* Using Arrays.copyOfRange() method */
        // Copy data array to new arrays
        int[] copy1 = Arrays.copyOfRange(data, 0, 3);
        int[] copy2 = Arrays.copyOfRange(data, 2, 4);
        System.out.println("\nUsing Arrays.copyOfRange() method...");
        System.out.println("Original Array: " + Arrays.toString(data));
        System.out.println("Copy1 (0, 3): " + Arrays.toString(copy1));
        System.out.println("Copy2 (2, 4): " + Arrays.toString(copy2));
    }
}
/*
•	 boolean[] copyOf(boolean[] original, int newLength)
•	 byte[] copyOf(byte[] original, int newLength)
•	 char[] copyOf(char[] original, int newLength)
•	 double[] copyOf(double[] original, int newLength)
•	 float[] copyOf(float[] original, int newLength)
•	 int[] copyOf(int[] original, int newLength)
•	 short[] copyOf(long[] original, int newLength)
•	 <T> T[] copyOf(T[] original, int newLength)
* */
/*
* The Arrays class contains a copyOfRange() method that lets you copy a range of elements from an
array to another array. Its declaration for the int array is int[] copyOfRange(int[] original, int from,
int to). The method is overloaded for all data types. Here, from and to are the initial index (inclusive) and final
index (exclusive) of the elements in the source array to be copied. These indexes must be within the range of the
source array, which means the length of the destination array can be, at maximum, equal to the source array
* */

