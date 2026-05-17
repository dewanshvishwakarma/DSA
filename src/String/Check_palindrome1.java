package String;

public class Check_palindrome1 {
//    for simple string
    static boolean check(String s){
        int i=0;
        int j=s.length()-1;

        while (i<j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

// more cleaner version
    static boolean check2(String s){
        int i=0;
        int j=s.length();
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
    String name ="madam";
    boolean result=check(name);
        System.out.println(result);


    if (check(name)){
        System.out.println("yes palindrome");
    }
    else{
        System.out.println("not palindrome");
    }
    }
}
