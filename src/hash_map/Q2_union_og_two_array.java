package hash_map;

import java.util.HashMap;

public class Q2_union_og_two_array {
    static void union(int[] a,int[] b){
        HashMap<Integer,Integer> map1=new HashMap<>();
//        HashMap<Integer,Integer> map2=new HashMap<>();

        for(int v1:a){
            if(map1.containsKey(v1)){
                map1.put(v1,map1.get(v1)+1);
            }else{
                map1.put(v1,1);
            }
        }

        for(int v2:b){
            if(map1.containsKey(v2)){
                map1.put(v2,map1.get(v2)+1);
            }else{
                map1.put(v2,1);
            }
        }

        for(int k:map1.keySet()){
            System.out.println(k + " ");
        }

    }
    static void main(String[] args) {
int[] arr1={7,3,9};
int[] arr2={6,3,9,2,9,4};

union(arr1,arr2);

    }
}
