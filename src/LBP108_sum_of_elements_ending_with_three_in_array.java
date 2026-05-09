import java.util.Scanner;

public class LBP108_sum_of_elements_ending_with_three_in_array {
    static boolean Last3(int n){
        int last=n%10;
        n=n/10;
        if(last==3){
            return true;
        }
        return false;
    }
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int sum=0;

        for(int j=0;j<a.length;j++){
            if(Last3(a[j])){
                sum=sum+a[j];
            }
        }
        System.out.print(sum);

    }
}
