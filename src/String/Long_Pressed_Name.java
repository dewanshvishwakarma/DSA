package String;

public class Long_Pressed_Name {
    static boolean long_Pressed(String name,String typed){
        int n=name.length();
        int n2=typed.length();
        int i=0;
        int j=0;
        while (j<n2 && i<n){
            if(name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }else{
                if (j>0 && typed.charAt(j)==typed.charAt(j-1)){
                    j++;
                }else {
                    return false;
                }
            }
        }
        // Check remaining characters in typed
        while (j < n2) {
            if (typed.charAt(j) != typed.charAt(j - 1)) {
                return false;
            }
            j++;
        }
        
        if(i==n){
            return true;
        }


        return false;
    }
    static void main(String[] args) {


String s="alex";
String t="aaleex";
boolean result=long_Pressed(s,t);
        System.out.println(result);
    }
}
