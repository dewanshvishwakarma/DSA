import java.util.HashMap;
import java.util.Scanner;

public class LBP129_number_of_duplicate {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> map=new HashMap<>();

        for (int val: a){
            if (map.containsKey(val)){
                map.put(val,map.get(val)+1);
            }else{
                map.put(val,1);
            }
        }
        int count=0;
        for (int v:map.values()){
            if (v>1){
                count++;
            }
        }
        System.out.println(count);
    }
}
