package Recursion;

public class factorial {
    static int fac(int n){
        if (n==0){
            return 1;
        }else{
           return n*fac(n-1);
        }

    }

    public static void main(String[] args) {
        int f=fac(3);
        System.out.println(f);
    }
}
