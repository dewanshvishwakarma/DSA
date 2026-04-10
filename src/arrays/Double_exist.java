package arrays;

import java.util.HashSet;

public class Double_exist {
  static   public boolean checkIfExist(int[] arr){
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]*2==arr[j] || arr[j] * 2 == arr[i]){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean check(int[] a){
        HashSet<Integer> set=new HashSet<>();
        for (int num:a){
            if (set.contains(num*2) || set.contains(num/2) && num%2==0){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    static void main(String[] args) {
        int[] a={1,3,5};
        boolean result=checkIfExist(a);
        System.out.println(result);

        boolean result2=check(a);
        System.out.println(result2);
    }
}
