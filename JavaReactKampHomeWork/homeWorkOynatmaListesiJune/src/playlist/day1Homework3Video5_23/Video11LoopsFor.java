package playlist.day1Homework3Video5_23;

import java.util.Arrays;
import java.util.List;

public class Video11LoopsFor {
    public static void main(String... args) {
        List<Integer> list = List.of(5, 1, 4, 2, 3);
        System.out.println("------------------------");

        for (Integer item : list) {
            System.out.println(item);
        }
        System.out.println("------------------------");
        for (int j = 0; j < list.size(); ++j) {
            System.out.println("list[" + j + "] = " + list.get(j));
        }
        System.out.println("------------------------");
        list.forEach(item -> System.out.println(item));
        System.out.println("------------------------");
        list.forEach(System.out::println);
        System.out.println("------------------------");

        int arr[] = {5, 1, 4, 2, 3};
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("------------------------");
        for (int item : arr) {
            System.out.println(item);
        }
        System.out.println("------------------------");
        int i = 0;
        for (; ;) {
            if (i >= arr.length) {
                break;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);
            ++i;
        }
        System.out.println("Loop exited with index: " + i);
        System.out.println("------------------------");
        int j = 0;
        for (; ; ++j) {
            if (j >= arr.length) {
                break;
            }
            System.out.println("arr[" + j + "] = " + arr[j]);
        }
        System.out.println("Loop exited with index: " + j);
        System.out.println("------------------------");
        int k = 0;
        for (; k < arr.length; ++k) {
            System.out.println("arr[" + k + "] = " + arr[k]);
        }
        System.out.println("Loop exited with index: " + k);
        System.out.println("------------------------");
        for (int l = 0; l < arr.length; ++l) {
            System.out.println("arr[" + l + "] = " + arr[l]);
        }
        System.out.println("------------------------");
        int m = -1;
        for (; m++ < arr.length -1;) {
            System.out.println("arr[" + m + "] = " + arr[m]);
        }
        System.out.println("Loop exited with index: " + m);
        System.out.println("------------------------");
    }
}
