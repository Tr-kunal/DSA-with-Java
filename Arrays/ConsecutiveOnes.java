package Arrays;

public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] prices = {1, 1, 0, 1, 1, 1};
        int maxOnes = 0;
        int count = 0;

        for(int i:prices){
            if(i==1){
                count++;
            }else{
            count = 0;
        }
        maxOnes = Math.max(maxOnes,count);
    }
        System.out.println(maxOnes);
    }
}
