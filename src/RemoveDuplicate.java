public class RemoveDuplicate {
    static int  Duplicate(int[] a){
        int i=0;
        for (int j=1;j<a.length;j++){
            if (a[i] !=a [j]){
                i++;
                a[i]=a[j];
            }
        }
        return i+1;
    }
    public static  void main(String[] args){
        int[] arr={2,2,3,3,4,6,6};
       int lastIndex= Duplicate(arr);

        for (int i=0;i<lastIndex;i++){
            System.out.print(arr[i] + " ");
        }   
    }
}
