package Arrays;

public class AppearsOnce {
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        int xorr = 0;

        for(int i:arr){
            xorr^=i;
        }

        System.out.println(xorr);

    }
}
