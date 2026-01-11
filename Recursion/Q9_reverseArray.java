package Recursion;
public class Q9_reverseArray {

    static void reverse(int[] arr,int i, int n){
        if(i>=n/2) return;
        swap(arr, i, n-i-1);
        reverse(arr, i+1, n);

    }

    static void swap(int[] arr,int l, int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {6,45,76,23,75,98,23,235};
        reverse(arr, 0, arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
