package Arrays;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for(int i:nums){
            sum+=i;
            max = Math.max(max, sum);
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
