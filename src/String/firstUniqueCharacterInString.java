package String;

import java.util.HashMap;

public class firstUniqueCharacterInString {
    static int FUC(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();

        for (int i=0;i<n;i++){
            char ch =s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (int i=0;i<n;i++){
            char ch2=s.charAt(i);
            if (map.get(ch2)==1){
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args){
        String s="ee";
        int result=FUC(s);
        System.out.println("first unique character is " + result );

    }
}
