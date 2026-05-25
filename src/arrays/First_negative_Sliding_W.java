package arrays;

import java.util.LinkedList;
import java.util.Queue;

public class First_negative_Sliding_W {
    static int[] F_negative(int[] a,int k){
        int n=a.length ;
        int[] res=new int[n-k+1];
        Queue<Integer> q=new LinkedList<Integer>();

        for(int i=0;i<k;i++){
            if (a[i]<0){
                q.offer(a[i]);
            }
        }
        if (q.isEmpty()){
            res[0]=0;
        }else{
            res[0]=q.peek();
        }


        for (int i=k;i<n;i++){
            if (a[i]<0){
                q.offer(a[i]);
            }

            if (a[i-k]<0){
                q.poll();
            }

            if (q.isEmpty()){
                res[i-k+1]=0;
            }else{
                res[i-k+1]= q.peek();
            }

        }
        return res;



    }
    static void main(String[] args) {
        int[] a={12,-1,-7,8,-15,30,16,28};
        int result[]=F_negative(a,3);
        for (int i=0;i<a.length;i++){
            System.out.println(result[i]);
        }
    }
}
