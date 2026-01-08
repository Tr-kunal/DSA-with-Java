package Recursion;

public class Q2_1ton {
    public static void main(String[] args) {
        upton(5);
    }
    static void upton(int n){
        if(n==0){
            return;
        }
        upton(n-1);
        System.out.print(n+" ");
    }
}
