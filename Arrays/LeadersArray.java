package Arrays;

import java.util.*;

public class LeadersArray {
    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = nums[n-1];
        ans.add(nums[n-1]);

        for(int i=n-2;i>=0;i--){
            if(nums[i]>max){
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        Collections.reverse(ans);

        System.out.println(ans.toString());

    }
}
