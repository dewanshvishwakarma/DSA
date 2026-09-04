package arrays;

public class left_rotate_by_1 {
    static void left_rotate_one(int[] a){
        int n= a.length;
        int first=a[0];
        for (int i=1;i<n;i++){
            a[i-1]=a[i];
        }
        a[n-1]=first;
    }
    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        left_rotate_one(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]  + " ");
        }
    }

}
