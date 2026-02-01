package BinarySearch;

public class lowerBound {
    //bruteforce
    public static int lowBound(int n, int[] arr, int x) {
        int low = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < low && arr[i] >= x) {
                return i;
            }
        }
        return n;

    }

    //optimal

    public static int lowerBoundOptimal(int[] arr, int x) {
        int low = 0;                  
        int high = arr.length - 1;    
        int ans = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = { 3, 5, 8, 15, 19 };
        int x = 9;
        System.out.println(lowBound(n, arr, x));
        System.out.println(lowerBoundOptimal(arr,x));
    }

}
