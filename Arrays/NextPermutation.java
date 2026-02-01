package Arrays;
import java.util.*;

public class NextPermutation {

    public static int[] nextPerm(int[] nums) {
        int pivot = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        if (pivot == -1) {
            reverse(nums, pivot + 1, nums.length - 1);
            return nums;
        }

        for (int j = nums.length - 1; j > pivot; j--) {
            if (nums[j] > nums[pivot]) {
                swap(nums, pivot, j);
                break;
            }
        }
        reverse(nums, pivot + 1, nums.length - 1);
        return nums;
        
    } 

    public static void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l, r);
            l++;
            r--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        nextPerm(nums);
        System.out.println(Arrays.toString(nums));

    }
}
