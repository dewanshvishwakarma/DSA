package Binary_search;

import java.util.Scanner;

 public class LC_69_Square_root_of_x {
   static public int mySqrt(int x){
        int i=1;
        int j=x;
        int result=1;
        while (i<=j){
            int mid=i+(j-i)/2;
            long square_root=(long)mid*mid;
            if(square_root==x){
                return mid;
            }
            else if (square_root<x){
                result=mid;
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int x=sc.nextInt();

        int ans=mySqrt(x);
        System.out.println("the answer is " + ans);

    }
}
