package String;

public class String_frequency {
    static int[] count(String s){
        s.toLowerCase();
        int n=s.length();
        int[] ans=new int[26];
        for (int i=0;i<n;i++){
            char ch=s.charAt(i);
            int index=ch-'a';
            ans[index]=ans[index]+1;
        }return ans;


    }
    public static void main(String[] args) {
        String s="aaaaaaaaaaaa";
       int[] ans= count(s);
       char ch='A';
        for (int i=0;i< ans.length;i++){
            System.out.println(ch++ + "-"  + ans[i]);
        }


    }
}
