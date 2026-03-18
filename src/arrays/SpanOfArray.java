package arrays;

import java.util.Scanner;
//Q1  find sapn of array it means subtraction of max and min day 2
public class SpanOfArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of an array :");
//        int n= sc.nextInt();
//        int[] arr=new int[n];
//        System.out.println("enter the elements :");
//        for(int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//
//        int max=arr[0];
//        int min=arr[0];
//        for(int i=0;i<n;i++){
//            if (arr[i]>max){
//                max=arr[i];
//            }
//            if(arr[i]<min){
//                min=arr[i];
//            }
//        }
//        int span=max-min;
//        System.out.println("span is :" + span);


//Q2        find element in array
//        System.out.println("enter the size of an array :");
//        int n = sc.nextInt();
//        int[] a=new int[n];
//
//        System.out.println("enter the element :");
//        for(int i=0;i<a.length;i++){
//            a[i]= sc.nextInt();
//        }
//        System.out.println("enter the element to be found :");
//        int target= sc.nextInt();
//        int index=-1;
//        for(int i=0;i<a.length;i++){
//            if(a[i]==target){
//                index=i;
//                break;
//            }
//         }
//        System.out.println("found at index " + index);



//        Q3 BAR CHART
        System.out.println("enter the size of an array :");
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter the elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int floor=max;floor>=1;floor--){
            for(int j=0;j<n;j++) {
                if (arr[j] >= floor) {
                    System.out.print("*\t");
                } else {
                    System.out.println("\t");
                }
            }
            System.out.println();
        }
    }
}



