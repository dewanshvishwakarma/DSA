package String;

public class check_palindrome3 {
    static boolean check(String s){
        int i=0;
        int j=s.length()-1;
        while (i<j){

            while (i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while (i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            char left=s.charAt(i);
            char right=s.charAt(j);

            if (Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public  static void main(String[] args){
        String n="A man, a plan, a canal: Panama";
        boolean result=check(n);
        System.out.println(result);
    }
}
