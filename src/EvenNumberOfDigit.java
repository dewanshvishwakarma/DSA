public class EvenNumberOfDigit {
    static boolean  NumberHasEven(int n){
        int count=0;
        while (n!=0){
            n=n/10;
            count++;
        }
        if(count%2==0){
            return true;
        }
        else {
            return false;
        }
    }

    static int CountEven(int[] a){
        int n= a.length;
        int even_count=0;
        for (int i=0;i<n;i++){
            if (NumberHasEven(a[i])){
                even_count++;
            }
        }
            return even_count;
    }

//    approach 2:  convert each array element in string find length , if length is even increment even count

    static int StringCount(int[] a){
        int count=0;
        for (int i=0;i< a.length;i++){
            int len=String.valueOf(a[i]).length();
            if (len%2==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr={12,345,2,6,7896,4545};
        int result=StringCount(arr);
        System.out.println(result);


    }
}
