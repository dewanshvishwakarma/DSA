package arrays;

public class Move_zero_2 {

    static void move_zero_end(int[] a){
        int n= a.length;
        int nz=0;
        int z=0;
        while (nz<n){
            if (a[nz]!=0){
                int temp=a[nz];
                a[nz]=a[z];
                a[z]=temp;
                z++;
                nz++;
            }
            else {
                nz++;
            }
        }
    }
    public static void main(String[] args){
        int[] arr={0,2,0,4,1,0,1,0,2,0};
        move_zero_end(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
