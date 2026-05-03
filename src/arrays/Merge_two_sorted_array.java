package arrays;
// merge two sorted array type 1
public class Merge_two_sorted_array {
    static void AddSorted1(int[] a,int[] b,int m,int n){
        int i=m-1;
        int j=n-1;
        int k=a.length-1;

        while (j>=0){
            if (i>0 && a[i]>b[j]) {
                a[k] = a[i];
                i--;
                k--;
            }else{
                a[k]=b[j];
                k--;
                j--;
            }
        }
    }
//    print
    static void print(int[] a){
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i] + " ");
        }
    }
    public static void main(String[] args){
        int[] a1={1,3,5,0,0,0};
        int[] b1={2,4,6};
        AddSorted1(a1,b1,3,3);
        print(a1);
    }
}
