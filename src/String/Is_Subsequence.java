package String;

public class Is_Subsequence {
    static boolean sub(String s,String t){
        int n=s.length();
        int n2=t.length();
        int i=0;
        int j=0;
        while(j<n2){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i<n){
            return false;
        }
        return true;
    }
    static void main(String[] args) {
String s="abc";
String t="ahbgd";
boolean result=sub(s,t);
        System.out.println(result);
    }
}
