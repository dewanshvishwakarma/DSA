package Recursion;

public class Fibonacci_Number {
    static  int FN(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return FN(n-1)+FN(n-2);
        }
    }
}
