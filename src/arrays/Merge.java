package arrays;

public class Merge {
    static int[]  MergeTwoArray(int[] a,int[] b){
        int[] merge =new int[a.length+b.length];
        for (int i=0;i<a.length;i++){
            merge[i]=a[i];
        }
        for (int j=0;j<b.length;j++){
            merge[a.length+j]=b[j];
        }
        return merge;
    }

//    Q merge two sorted array
    static int[] SortedArray(int[] a,int[] b){
        int[] merge=new int[a.length+b.length];
        int k=0;
        int i=0, j=0;
        while (i<a.length && j<b.length){
            if (a[i]<=b[j]){
                merge[k++]=a[i++];
            }else{
                merge[k++]=b[j++];
            }
        }
        while (i< a.length){
            merge[k++]=a[i++];
        }
        while (j< b.length){
            merge[k++]=b[j++];
        }
        return merge;
    };

    static void print(int[] a){
        for (int i=0;i< a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9};
        int[] output=MergeTwoArray(arr1,arr2);
        print(output);


        int[] A={1,3,5};
        int[] B={2,2,4,6};
        int[] result=SortedArray(A,B);
        print(result);
    }
}
