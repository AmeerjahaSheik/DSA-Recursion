package PrefixSum;
import java.util.HashMap;

class Solution {
    public int subarraySum(int[] a, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];

            int needed = sum - k;

            if (map.containsKey(needed)) {
                count += map.get(needed);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] a = {1, 2, 3};
        int k = 3;

        int result = obj.subarraySum(a, k);

        System.out.println("Number of subarrays: " + result);
    }
}