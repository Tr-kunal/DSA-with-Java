package BinarySearch;

public class floorCeil {

    private static int floor(int[] arr,int x){
        int ans = -1;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            
            if(arr[mid]<=x){
                ans = arr[mid];
                l = mid+1;
            }
            else{
                h = mid-1;
            }
        }
        return ans;
    }

    private static int ceil(int[] arr,int x){
        int ans = -1;
        int l=0;
        int h=arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            
            if(arr[mid]>=x){
                ans = arr[mid];
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;
        System.out.println(floor(arr, x));
        System.out.println(ceil(arr, x));
    }
}
