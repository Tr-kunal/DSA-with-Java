package Arrays;

import java.util.*;

public class Union {
    public static void main(String[] args) {

        int n=10;
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        
        int m=7;
        int[] arr2 = {2,3,4,4,5,11,12};

        // using set
        Set<Integer> st = new HashSet<>();
        for(int i:arr1){
            st.add(i);
        }

        for(int j:arr2){
            st.add(j);
        }

        for(int k:st){
            System.out.print(k+" ");
        }

        System.out.println();
        
        //using Two pointers

        int i=0,j=0;
        ArrayList<Integer> union = new ArrayList<>();
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            else if(arr2[j]<arr1[i]){
                if(union.isEmpty()||union.get(union.size()-1)!=arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
            else{
                if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }

        for(int k:union){
            System.out.print(k+" ");
        }
    }

}
