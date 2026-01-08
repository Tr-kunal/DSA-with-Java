package Recursion;

public class Q7_reverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(18945));

        System.out.println(reverse2(180945,0));
    }

    //using string as a return type
    static String reverse(int n){
        if(n==0){
            return "";
        }
        return n%10 + reverse(n/10);
    }

    // using remainder method
    static int reverse2(int n, int sum){
        if(n==0){
            return sum;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        return reverse2(n/10,sum);
    }
}