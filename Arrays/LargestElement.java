package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] nums = {8, 10, 5, 7, 9};
        int ans = nums[0];
        for(int i:nums){
            if(ans<i){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
