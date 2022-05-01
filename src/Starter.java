package src;

public class Starter {

    public static int  fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        fact(n-1);
        System.out.println(n);
        fact(n-1);
        return n;
    }

    public static void main(String[] args) {
        fact(3);
    }
}
