package arrays;

public class right_rotate_by_1 {
    static void rotateRightOne(int[] a){
        int n=a.length;
        int last=a[n-1];
        for (int i=n-2;i>=0;i--){
            a[i]=a[i+1];
        }
        a[0]=last;
    }

    public static void main(String[] args) {

    }

}
