package Arrays;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {5,6,4,7,8};
        int n = arr.length;
        boolean isSorted=true;
        if(n<2){
            System.out.println(true);
        }
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                isSorted=false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
