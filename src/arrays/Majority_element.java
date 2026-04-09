package arrays;


import java.util.Arrays;
import java.util.HashMap;

public class Majority_element {
    static int Majority1(int[] a){
        for (int i=0;i< a.length;i++) {
            int count=0;
            for (int j=0;j<a.length;j++){
                if (a[i]==a[j]){
                    count++;
                }
            }
            if (count>a.length/2){
                return a[i];
            }
        }
        return -1;
    }


    static int Majority2(int[] a){
        int n=a.length;
        Arrays.sort(a);
        return a[n/2];
    }


//    by hash map
    static int Majority3(int[] a){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i:a){
            map.put(i, map.getOrDefault(i,0)+1);
            if (map.get(i)>a.length/2){
                return i;
            }
        }
        return -1;
    }

    static int Majority4(int[] a){
        int n= a.length;
        int candidate=0;
        int vote=1;
        for (int i:a){
            if (vote==0){
                candidate=i;
            }
            if (i==candidate){
                vote++;
            }
            else{
                vote--;
            }
        }
        return candidate;
    }

static int majority5(int[] a){
        int candidate=a[0];
        int count=0;
        for(int num:a){
            if (num==candidate){
                count++;
            }
            else {
                count--;
                if (count==0){
                    candidate=num;
                    count++;
                }
            }
        }
        return candidate;
    }

   public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        int result=Majority1(arr);
       System.out.println(result);

       int result2=Majority2(arr);
       System.out.println(result2);

       int result3=Majority3(arr);
       System.out.println(result3);

       int result4=Majority4(arr);
       System.out.println(result4);

       int result5=majority5(arr);
       System.out.println(result5);
    }
}
