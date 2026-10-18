package Binary_search;

import java.util.Scanner;
//https://leetcode.com/problems/valid-perfect-square/description/
public class Lc_367_valid_perfect_square {
    static public boolean isPerfectSquare(int num){
        int i=1;
        int j=num;
        while (i<=j){
            int mid=i+(j-i)/2;
            long square=(long) mid*mid;//Use long for the square calculation to avoid integer overflow.

            if (square==num){
                return true;
            }else if(square>num){
                j=mid+1;
            }else{
                i=mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        boolean result=isPerfectSquare(x);
        System.out.println(result);

    }
}
