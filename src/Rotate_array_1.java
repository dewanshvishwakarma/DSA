public class Rotate_array_1 {
    static void reverse(int[] a,int i,int j){
        while(i<j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    static void Rotate(int[] a,int k ){
        int n= a.length;
        k=k%n;
        if(k<0){
            k=k+n;
        }
        reverse(a,0,n-k-1);
        reverse(a,n-k,n-1);
        reverse(a,0,n-1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        Rotate(arr,5);
        System.out.println("after rotation :");
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

