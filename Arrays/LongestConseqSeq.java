package Arrays;

import java.util.*;
public class LongestConseqSeq {

    public static int longConsSeq(int[] arr){
        int n = arr.length;

        if(n==0) return 0;

        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;

        Arrays.sort(arr);

        for(int i=0;i<n;i++){
            if(arr[i]-1 == lastSmaller){
                count++;
                lastSmaller=arr[i];
            }else if(arr[i]-1 != lastSmaller){
                count = 1;
                lastSmaller = arr[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }

    public static int lcsOptimal(int[] arr){
        int n = arr.length;

        if(n==0) return 0;

        int longest = 1;
        int lastSmaller = Integer.MIN_VALUE;
        int count = 0;

        HashSet<Integer> st = new HashSet<>();

        for(int i:arr){
            st.add(i);
        }

        for(int j:arr){
            if(!st.contains(j-1)){
                count = 1;
                lastSmaller=j; 
            }
            while(st.contains(lastSmaller+1)){
                lastSmaller++;
                count++;
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2}; 
        int ans = lcsOptimal(arr);
        System.out.println(ans);
    }
}
