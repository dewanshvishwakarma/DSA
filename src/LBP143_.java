import java.util.Scanner;

public class LBP143_ {
    static void count(int s,int l){
        if(s>l){
            System.out.print(s);
        }
        for(int i=s;i<=l;i++){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int l=sc.nextInt();
        count(s,l);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
