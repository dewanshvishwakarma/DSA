package Recursion;

import java.util.Scanner;

public class Fibonacci_Number {
    static  int FN(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return FN(n-1)+FN(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        int ans=FN(n);
        System.out.println(ans);

    }
}
