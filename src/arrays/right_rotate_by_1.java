package arrays;

public class right_rotate_by_1 {
    static void rotateRightOne(int[] a){
        int n=a.length;
        int last=a[n-1];
        for (int i=n-2;i>=0;i--){
            a[i+1]=a[i];
        }
        a[0]=last;
    }

    public static void main(String[] args) {
        int[] a={10,20,30,40,50};
        rotateRightOne(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i] + " ");
        }

    }

}
