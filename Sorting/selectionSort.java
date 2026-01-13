package Sorting;

public class selectionSort {

    public static void selSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minInd = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minInd]){
                    minInd = j;
                }
            }
            swap(arr, i, minInd);
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
        selSort(arr);
    }
}
