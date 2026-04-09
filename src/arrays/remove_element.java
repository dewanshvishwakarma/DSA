package arrays;


public class remove_element {

    private static Object result;

    static int Remove(int[] a, int val){
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=val){
                a[k]=a[i];
                k++;
            }
        }
        return k;
    }
   public static void main(String[] args) {
    int[] arr={1,2,3,3,2,7};
    int result=Remove(arr,2);
       System.out.println(result);
    }
}
