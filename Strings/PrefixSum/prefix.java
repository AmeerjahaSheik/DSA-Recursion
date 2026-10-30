package PrefixSum;

public class prefix {

    static int[] prefixSum(int[] arr) {
        int[] pref = new int[arr.length];

        pref[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            pref[i] = pref[i - 1] + arr[i];
        }

        return pref;
    }

    static int rangeSum(int[] pref, int left, int right) {

        if (left == 0) {
            return pref[right];
        }

        return pref[right] - pref[left - 1];
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 6};

        int[] pref = prefixSum(arr);

        int left = 1;
        int right = 3;

        System.out.println(rangeSum(pref, left, right));
    }
}