package playlist.day1Homework3Video5_23;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Video14Arrays {
    public static void main(String[] args) {
        try {
            // Create the array of int of length 2
            Object arrayObject = Array.newInstance(int.class, 2);
            // Print the values in array element. Default values will be zero
            int n1 = Array.getInt(arrayObject, 0);
            int n2 = Array.getInt(arrayObject, 1);
            System.out.println("n1 = " + n1 + ", n2 = " + n2);
            // Set the values to both elements
            Array.set(arrayObject, 0, 101);
            Array.set(arrayObject, 1, 102);
            // Print the values in array element again
            n1 = Array.getInt(arrayObject, 0);
            n2 = Array.getInt(arrayObject, 1);
            System.out.println("n1 = " + n1 + ", n2 = " + n2);
        } catch (NegativeArraySizeException | IllegalArgumentException
                | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        // Create an array of length 2
        int[] ids = {101, 102};
        System.out.println("Old array length: " + ids.length);
        System.out.println("Old array elements: " + Arrays.toString(ids));
        // Expand the array by 1
        ids = (int[]) expandBy(ids, 1);
        // Set the third element to 103
        ids[2] = 103; // This is newly added element
        System.out.println("New array length: " + ids.length);
        System.out.println("New array elements: " + Arrays.toString(ids));
    }
    public static Object expandBy(Object oldArray, int increment) {
        // Get the length of old array using reflection
        int oldLength = Array.getLength(oldArray);
        int newLength = oldLength + increment;
        // Get the class of the old array
        Class<?> cls = oldArray.getClass();
        // Create a new array of the new length
        Object newArray = Array.newInstance(cls.getComponentType(), newLength);
        // Copy the old array elements to new array
        System.arraycopy(oldArray, 0, newArray, 0, oldLength);
        return newArray;
    }
}