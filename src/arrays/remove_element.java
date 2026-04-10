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
    
    static int Remove1(int[] a , int val){
        int n=a.length;
        int j=n-1;
        int i=0;
        while (i<j){
            if (a[i]==val){
                a[i]=a[j-1];
                j--;
            }else {
                i++;
            }
        }
        return j;
    }
   public static void main(String[] args) {
    int[] arr={1,2,3,3};
    int result=Remove(arr,2);
       System.out.println(result);


    int result2=Remove1(arr,2);
       System.out.println(result2);
    }
}
