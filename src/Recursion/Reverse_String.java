package Recursion;

public class Reverse_String {
    static void reverseString(char[] a,int s,int e){
        //base case
        if (s>=e){
            return;
        }
        char temp=a[s];
        a[s]=a[e];
        a[e]=temp;
        reverseString(a,s+1,e-1);
    }

    public static void main(String[] args) {
        char[] a={'D','e','w','a','n','s','h'};
        int n=a.length;
        reverseString(a,0,n-1);
        for (int i=0;i<n;i++){
            System.out.println(a[i] +  " ");
        }
    }
}
