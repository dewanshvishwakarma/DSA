import java.util.Scanner;

public class LBP144_alphabet_average {
    static double averageLetter(String s){
        int sum=0;
        for(int i=0;i<s.length();i++){
            char ch=Character.toUpperCase(s.charAt(i));
            int value=ch -'A' + 1;
            sum+=value;
        }

        double average=(double)sum/s.length();
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x=sc.nextLine();
        double ave=averageLetter(x);
        // System.out.print(ave);
        System.out.printf("%.2f", ave);

    }
}
