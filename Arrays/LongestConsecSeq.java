package Arrays;

public class LongestConsecSeq {

    public static boolean linearSearch(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }

    //brute force
    public static void longestCons(int[] arr){
        int n = arr.length;
        int longest = 1;
        for(int i=0;i<n;i++){
            int x = arr[i];
            int count = 1;
            while(linearSearch(arr, x+1)==true){
                x++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        System.out.println(longest);

    }

    public static void main(String[] args) {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        longestCons(arr);  //for bruteforce approach
        

    }
}