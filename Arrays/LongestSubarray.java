package Arrays;

// import java.util.*;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int targetSum = 15;
        int n = nums.length;
        int maxLen = 0;
        int sum = nums[0]; 
        int l=0, r=0;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i; j < n; j++) {
        //         int sum = 0;
        //         for (int k = i; k <= j; k++) {
        //             sum += nums[k];
        //         }
        //         if (sum == targetSum) {
        //             maxLen = Math.max(maxLen, j - i + 1);
        //         }
        //     }
        // }
        // System.out.println(maxLen);

        while(r<n){
            while(l<=r && sum>targetSum){
                sum -= nums[l];
                l++;
            }
            if(sum == targetSum){
                maxLen = Math.max(maxLen,r-l+1);
            }
            r++;
            if(r<n){
                sum+=nums[r];
            }
        }
        System.out.println(maxLen);

    }
}
