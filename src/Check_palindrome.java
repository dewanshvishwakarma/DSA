public class Check_palindrome {
    static boolean Is_palindrome(int n){
        int rev=0;
        int temp=n;

        while (n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int n=121;
        boolean result=Is_palindrome(n);
        System.out.println(result);
    }
}
