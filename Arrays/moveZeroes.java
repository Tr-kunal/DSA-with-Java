package Arrays;

public class moveZeroes {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,0,5,0,8,12};
         int k=0;
        
         for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
         }

         for(int j=k;j<nums.length;j++){
            nums[j]=0;
         }

         for(int i : nums){
            System.out.print(i+" ");
         }
    }
}
