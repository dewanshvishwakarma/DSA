
package arrays;

public class FindNumberWithEven {
    static int countEvenDigit(int[] a){
        int count=0;
        for (int i=0;i<a.length;i++){
            int len=String.valueOf(a[i]).length();

            if(len%2==0){
                count++;
            }
        }
        return count;
    }


    static boolean Devide(int n){
        int even=0;
        while (n!=0){
            n=n/10;
            even++;
        }
        if (even%2==0){
                return true;
        }
        return false;
    }
    static int devideApproach(int[] a){
        int count=0;
        for (int i=0;i<a.length;i++){
            if (Devide(a[i])){
                count++;
            }
        }
        return count++;
    }
    public static void main(String[] args){
        int[] arr={12,345,2,5,154524,12,12};
        int output=devideApproach(arr);
        System.out.println(output);

        int n=112;
        boolean result =Devide(n);
        System.out.println(result);
    }
}
