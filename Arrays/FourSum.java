package Arrays;

import java.util.*;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] arr, int target) {
        int n = arr.length;
        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                Set<Integer> st = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    int fourth = target - (arr[i] + arr[j] + arr[k]);
                    
                    if(st.contains(fourth)){
                        List<Integer> ls = Arrays.asList(arr[i],arr[j],arr[k],fourth);
                        Collections.sort(ls);
                        ans.add(ls);
                    }

                    st.add(arr[k]);
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static List<List<Integer>> fourSumOptimal(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1])
                    continue;
                int l = j + 1;
                int r = n - 1;

                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));

                        while (l < r && nums[l] == nums[l + 1])
                            l++;
                        while (l < r && nums[r] == nums[r - 1])
                            r--;
                        l++;
                        r--;
                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }

            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        System.out.println(fourSum(arr, target));
        System.out.println(fourSumOptimal(arr, target));

    }
}
