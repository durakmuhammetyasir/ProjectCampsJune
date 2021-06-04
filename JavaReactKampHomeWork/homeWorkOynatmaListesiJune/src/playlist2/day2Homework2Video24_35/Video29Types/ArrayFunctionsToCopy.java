package playlist2.day2Homework2Video24_35.Video29Types;

import java.util.Arrays;

public class ArrayFunctionsToCopy {

    // Uses a for-loop to copy an array
    public static int[] expandArray(int[] oldArray, int newLength) {
        int originalLength = oldArray.length;
        int[] newArray = new int[newLength];
        int elementsToCopy = originalLength > newLength ? newLength : originalLength;
        for (int i = 0; i < elementsToCopy; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }
    public static void printArrays(int[] original, int[] expanded, int[] truncated) {
        System.out.println("Original Array: " + Arrays.toString(original));
        System.out.println("Expanded Array: " + Arrays.toString(expanded));
        System.out.println("Truncated Array: " + Arrays.toString(truncated));
    }
}
