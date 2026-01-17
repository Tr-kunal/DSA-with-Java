package Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2,1,1,1,2};
        int n = arr.length;

        int elem = 0;
        int count = 0;

        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                elem = arr[i];
            }else if(elem==arr[i]){
                count++;
            }else{
                count--;
            }
        }

        int c = 0;
        for(int i:arr){
            if(i==elem){
                c++;
            }
        }

        if(c>n/2){
            System.out.println(elem);
        }else{
            System.out.println(-1);
        }
    }
}
