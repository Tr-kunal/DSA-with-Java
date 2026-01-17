package Arrays;

public class SortColors {

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void sortColors(int[] nums, int n){
        int low=0, mid=0, high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 2, 0, 1,0 };
        int n = nums.length;
        sortColors(nums, n);
        for(int i:nums){
            System.out.print(i+" ");
        }
    }
}
