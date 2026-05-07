public class Check_prime {

// basic approach to check prime or not
    static boolean Is_Prime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0);
            return false;
        }
        return true;
    }
    public static  void main(String[] args){
        int n=1;
        boolean result = Is_Prime(n);
        System.out.println(result);

    }
}
