package String;

public class Check_palindrome2 {
//    check complex string like "A man, a plan, a canal: Panama"
    static boolean check(String s){
        int i=0;
        int j=s.length()-1;

        while (i<j){
            char left=s.charAt(i);
            char right=s.charAt(j);

            if(!Character.isLetterOrDigit(left)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(right)){
                j--;
                continue;
            }

            if (Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
   public static void main(String[] args) {
String sentence="A man, a plan, a canal: Panama";
boolean result= check(sentence);
       System.out.println(result);
    }
}
