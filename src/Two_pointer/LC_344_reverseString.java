package Two_pointer;
//https://leetcode.com/problems/reverse-string/
public class LC_344_reverseString {
    public void reverseString(char[] s){
        int i=0;
        int j=s.length-1;
        while (i<j){
            char t=s[i];
            s[i]=s[j];
            s[i]=t;
            i++;
            j--;
        }
    }
}
