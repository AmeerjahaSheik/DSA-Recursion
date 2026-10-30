package PrefixSum;

public class pref {

    static int[] prefix(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 2};

        int[] result = prefix(arr);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}