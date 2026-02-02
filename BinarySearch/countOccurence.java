package BinarySearch;

public class countOccurence {

    private static int firstOccur(int[] arr,int x){
        int l=0;
        int h=arr.length-1;
        int first = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==x){
                first = mid; 
                h = mid-1;               
            }else if(arr[mid]<x){
                l=mid+1;

            }else{
                h=mid-1;
            }
        }
        return first;
    }

    private static int lastOccur(int[] arr,int x){
        int l=0;
        int h=arr.length-1;
        int last = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]==x){
                last = mid; 
                l = mid+1;               
            }else if(arr[mid]<x){
                l=mid+1;

            }else{
                h=mid-1;
            }
        }
        return last;
    }

    private static int counter(int[] arr, int x) {
        int first = firstOccur(arr, x);
        if (first == -1) {
            return 0;
        }
        int last = lastOccur(arr, x);
        return last - first + 1;
    }


    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 8;
        System.out.println(counter(arr, x));
    }
}
