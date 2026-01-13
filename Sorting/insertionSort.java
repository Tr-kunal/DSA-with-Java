package Sorting;

public class insertionSort {
    public int[] insertSort(int[] nums) {
        int n = nums.length; 
        
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            
            nums[j + 1] = key;
        }
        
        return nums;
    }
}


class Main {
    public static void main(String[] args) {
        insertionSort ans = new insertionSort();
        
        int[] nums = {13, 46, 24, 52, 20, 9};
        nums = ans.insertSort(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}

