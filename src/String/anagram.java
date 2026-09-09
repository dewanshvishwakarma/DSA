package String;

import java.util.HashMap;

public class anagram {
    static boolean isAnagram(String s ,String t){
        HashMap<Character, Integer> map=new HashMap<>();

        int m=s.length();
        int n=t.length();

        if (m!=n){
            return false;
        }

        for (int i=0;i<m;i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<n;i++){
            char c=t.charAt(i);
            if (!map.containsKey(c)){
                return false;

            }
            map.put(c,map.get(c)-1);
            if (map.get(c)<0){
                return false;
            }
        }

return true;
    }
    public static void main(String[] args) {
        String s="dewansh";
        String t="dewan";
        boolean result=isAnagram(s,t);
        System.out.println(result);

    }
}
