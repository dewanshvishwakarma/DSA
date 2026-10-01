package Two_pointer;

public class LC_680_valid_palindrome_ii {
    public boolean IsPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;

        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(IsPalindrome(s,i+1,j)){
                    return true;
                }
                if(IsPalindrome(s,i,j-1)){
                    return true;
                }
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }
}
