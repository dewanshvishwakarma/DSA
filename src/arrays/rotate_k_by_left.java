package arrays;

public class rotate_k_by_left {
    static void reverse(int[] a,int s,int e){
        while (s<=e){
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
        s++;
        e--;
        }
    }
    static void rotate(int[] a ,int k){
        int n=a.length;
        reverse(a,0,k-1);
        reverse(a,k,n-1);
        reverse(a,0,n-1);
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        rotate(a,2);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }

    }
}
