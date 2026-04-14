package arrays;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of array first array : ");
        int n1=sc.nextInt();
        int[] arr1=new int[n1];

        System.out.println("enter the " + n1 +" elements :");
        for (int i=0;i<arr1.length;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("enter the size of array second array : ");
        int n2=sc.nextInt();
        int[] arr2=new int[n2];

        System.out.println("enter the " + n2 +" elements :");
        for (int i=0;i<arr2.length;i++){
            arr2[i]=sc.nextInt();
        }

        int[] output=new int[1+Math.max(n1,n2)];
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=output.length-1;
        int c=0;

        while(i>=0 && j>=0){
            int sum=arr1[i]+arr2[j]+c;
            output[k]=sum%10;
            c=sum/10;
            i--;
            j--;
            k--;
        }

        while(i>=0){
            int sum=arr1[i]+c;
            output[k]=sum%10;
            c=sum/10;
            i--;
            k--;
        }

        while(j>=0){
            int sum=arr2[j]+c;
            output[k]=sum%10;
            c=sum/10;
            j--;
            k--;
        }

        if(c>0){
            output[0]=c;
        }

        System.out.print("sum of two array is : ");

        if(output[0]==0){
            for(int m=1;m<output.length;m++){
                System.out.print(output[m]+" ");
            }
        }else{
            for(int m=0;m<output.length;m++){
                System.out.print(output[m]+" ");
            }
        }
    }
}