import java.util.Scanner;

public class pairSum {
//Q 1 :count number of sum Pair(PW JAVA DSA)
    static int pairSumFunction(int[] a,int target){
        int n= a.length;
        int pair=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==target){
                pair++;
                }
            }
        }
        return pair;
    }

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.(LEETCODE PROBLEM 1)

    static int[] TwoSum(int[] a,int target){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

//    TRIPLE SUM
    static int tripleSumPair(int[] a,int target){
        int n=a.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(a[i]+a[j]+a[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size :");
        int n= sc.nextInt();
        int[] arr=new int[n];

        System.out.println("enter the " + n + " elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target:");
        int target= sc.nextInt();
//        System.out.println(pairSumFunction(arr,target));
//        int[] ans =TwoSum(arr,target);
//        System.out.println(ans[0]+" "+ ans[1]);
        System.out.println(tripleSumPair(arr,target));
     }
}
