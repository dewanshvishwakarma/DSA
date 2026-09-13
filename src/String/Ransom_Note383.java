package String;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;

public class Ransom_Note383 {
    static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int count=map.size();
        for (int i=0;i<magazine.length();i++){
            char ch2=magazine.charAt(i);
            if (map.containsKey(ch2) && map.get(ch2)>0){
                map.put(ch2,map.get(ch2)-1);
                if (map.get(ch2)==0) {
                count--;
            }
            }
        }

        return count==0;
    }

    public static void main(String[] args) {
String r="dewa";
String m="awedg";
boolean ans =canConstruct(r,m);
        System.out.println(ans);
    }
}
