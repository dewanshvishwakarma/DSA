package arrays;

public class ThirdLargest {
    static int Third_Largest(int[] a){
        int largest=Integer.MIN_VALUE;
        int S_largest=Integer.MIN_VALUE;
        int T_largest=Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++){
            if (a[i]>largest){
                T_largest=S_largest;
                S_largest=largest;
                largest=a[i];
            } else if (a[i]>S_largest && a[i]<largest) {
                T_largest=S_largest;
                S_largest=a[i];
            } else if (a[i]>T_largest && a[i]<S_largest) {
                T_largest=a[i];
            }
        }
        return T_largest;
    }
    public static void main(String[] args){
        int[] arr={12,1,11,20,90,45};
        int output=Third_Largest(arr);
        System.out.println("third largest of an array is " + output);
    }
}
