package Arrays;

public class ElemBySign {

    public static void main(String[] args) {
        int[] nums = {1, 2, -4, -5};
        int n = nums.length;
        int[] ans = new int[n];
        
        int posIdx = 0;
        int negIdx = 1;
        
        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                ans[posIdx] = nums[i];
                posIdx += 2;
            } else {
                ans[negIdx] = nums[i];
                negIdx += 2;
            }
        }
        
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
}
