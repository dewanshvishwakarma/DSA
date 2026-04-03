package cybromeJAVA;
//learn loop

import java.util.Scanner;

public class control_statement {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
//        System.out.println("enter the number :");
//        int num=sc.nextInt();

//        if (num%2==0){
//            System.out.println("even");
//        }else {
//            System.out.println("odd");
//        }

//        for (;;){
            // infinite loop
//            System.out.println("hllo");
//        }
        for (int i = 0; i < 5;) {
            System.out.println(i);
            i++; // manually increment
        }
//        for (int i = 0; ; i++) {
//            System.out.println(i);
//        }
    }
}
