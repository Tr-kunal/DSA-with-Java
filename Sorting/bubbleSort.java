package Sorting;

public class bubbleSort {

    public static void bubSort(int[] arr){
        int n = arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j+1);               
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        bubSort(arr);
    }
}

