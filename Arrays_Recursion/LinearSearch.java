package Arrays_Recursion;

import java.util.ArrayList;

public class LinearSearch {

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4, 6, 7};
        int target = 4;

        // 1. Check whether the target exists
        System.out.println(find(arr, target, 0));

        // 2. Find the first occurrence from left to right
        System.out.println(findIndex(arr, target, 0));

        // 3. Find the first occurrence from right to left
        System.out.println(findIndexLast(arr, target, arr.length - 1));

        // 4. Find all occurrences
        findAllIndex(arr, target, 0);
        System.out.println(list);
    }

    // 1. Return true if the target exists, otherwise false
    static boolean find(int[] arr, int target, int index) {

        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || find(arr, target, index + 1);
    }

    // 2. Find the first occurrence from the left
    static int findIndex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return findIndex(arr, target, index + 1);
    }

    // 3. Find the first occurrence from the right
    static int findIndexLast(int[] arr, int target, int index) {

        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return findIndexLast(arr, target, index - 1);
    }

    // 4. Find all occurrences
    static void findAllIndex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        findAllIndex(arr, target, index + 1);
    }
}