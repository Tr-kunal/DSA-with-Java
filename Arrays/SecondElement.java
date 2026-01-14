package Arrays;

public class SecondElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        int min = Integer.MAX_VALUE;  
        int max = Integer.MIN_VALUE;
        int secMin = Integer.MAX_VALUE;
        int secMax = Integer.MIN_VALUE;
        
        if(n==0 || n==1){
            System.out.println(-1);
        }

        //For second SmallestElement
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                secMin = min;
                min = arr[i];
            }
            else if(secMin>arr[i] && min!=arr[i]){
                secMin = arr[i];
            }
        }

        //For second LargestElement
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                secMax = max;
                max = arr[i];
            }
            else if(secMax<arr[i] && max!=arr[i]){
                secMax = arr[i];
            }
        }
        System.out.println("Second Smallest Element: "+secMin);
        System.out.println("Second Largest Element: "+secMax);
    }
}
