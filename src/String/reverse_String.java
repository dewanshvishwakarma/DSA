package String;

public class reverse_String {
    static void reverse(char[] s){
        int i=0;
        int j=s.length-1;
        while (i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
    }
    static void main(String[] args) {
//        char[] c={"h","e","l","l","o"];
//        char[] r=reverse(c);
//
}}
