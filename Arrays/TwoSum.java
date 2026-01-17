package Arrays;

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSumInd(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int c = target - arr[i];
            if (map.containsKey(c)) {
                return new int[] { map.get(c), i };
            }
            map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }
   public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] res = twoSumInd(arr, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
