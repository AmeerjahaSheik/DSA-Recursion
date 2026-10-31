package PrefixSum;


class Solution {
    public int[] productExceptSelf(int[] a) {
        int n = a.length;
        int[] ans = new int[n];

        // Step 1: Calculate left products
        ans[0] = 1;

        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * a[i - 1];
        }

        // Step 2: Calculate right products
        int right = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = right * a[i];
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] a = {1, 2, 3, 4};

        int[] result = obj.productExceptSelf(a);

        System.out.print("Output: ");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}