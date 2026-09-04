package String;

public class last_word_in_String {
    static int findLength(String s){
        int n=s.length();
        int i=n-1;
        int res=0;
        while (i>0){
            char ch=s.charAt(i);
            if (ch==' '){
                break;
            }else{
                res++;
                i--;
            }
        }
        return res;
    }
    public static void main(String[] args){
        String s="i love you sanjana";
        int ans=findLength(s);
        System.out.println(ans);

    }

}
