package Arrays;

import java.util.HashMap;

public class SubArraySumK {

    public static int SubarraySum(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int subarraySumk(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1); 

        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 4 };
        int k = 6;
        int ans = subarraySumk(arr, k);
        System.out.println(ans);

    }
}
