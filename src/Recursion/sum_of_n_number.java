package Recursion;

public class sum_of_n_number {
    static int sum(int n){
        if(n==1){
            return 1;
        }else{
            return n+sum(n-1);
        }
    }

    public static void main(String[] args) {
        int s=sum(2);
        System.out.println(s);
    }
}
