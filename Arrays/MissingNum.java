package Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {1,2,4,3,5};
        
        //for sorted array;
        // int miss = -1;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]!=i+1){
        //         miss = i+1;
        //         break;
        //     }
        // }

        // if(miss==-1){
        //     miss=n;
        // }
        // System.out.println(miss);

        //if array may be unsorted

        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;

        for(int i:arr){
            actualSum+=i;
        }

        int miss = expectedSum - actualSum;
        System.out.println(miss);

    }
}
