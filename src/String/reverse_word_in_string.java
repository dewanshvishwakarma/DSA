package String;

public class reverse_word_in_string {
    static String reverse(String s){
        s=s.trim();
        String[] word=s.split("\\s+");
        String result=" ";
        for(int i= word.length-1;i>=0;i--){
            result+=word[i];
            if (i!=0){
                result+=" ";
            }
        }
        return result;
    }
    public static void main(String[] args){
        String s="my name is java";
        String result=reverse(s);
        System.out.println(result);
    }
}
