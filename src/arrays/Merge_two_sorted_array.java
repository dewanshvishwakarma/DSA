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
//    type 2

    static int[]  MergeArray(int[] a,int[] b){
        int m= a.length;
        int n=b.length;
        int i=0;
        int j=0;
        int[] result =new int[m+n];
        int k=0;

        while (i<m && j<n){
            if (a[i]<=b[j]){
                result[k]=a[i];
                i++;
                k++;
            }else {
                result[k]=b[j];
                j++;
                k++;
            }
        }
        while (i<a.length){
            result[k]=a[i];
            k++;
            i++;
        }

        while (j<b.length){
            result[k]=b[j];
            k++;
            j++;
        }
        return result;
    }
//    print
    static void print(int[] a){
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i] + " ");
        }
    }
    public static void main(String[] args){
//        int[] a1={1,3,5,0,0,0};
//        int[] b1={2,4,6};
//        AddSorted1(a1,b1,3,3);
//        print(a1);

        int[] a={1,3,5};
        int[] b={2,4,6,8};
        int[] result =MergeArray(a,b);
        print(result);
    }
}
