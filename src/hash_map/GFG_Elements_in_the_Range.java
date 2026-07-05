package hash_map;

import java.util.HashMap;

public class GFG_Elements_in_the_Range {
    public static boolean checkElements(int start, int end, int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        for (int i=start;i<=end;i++){
            map.put(i,1);
        }
        int count=map.size();

        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])-1);

                if (map.get(arr[i])==0){
                    count--;
                }
            }
        }
        return count==0;
    }

    public static void main(String[] args) {
        int[] a={1,4, 5, 2, 7, 8, 3};
        boolean ans=checkElements(2,5,a);
        System.out.println(ans);
    }
}
