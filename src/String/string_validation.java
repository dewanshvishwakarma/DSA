package String;

import java.util.Scanner;

public class string_validation {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your name : ");
        String name=sc.nextLine();

        if (name.trim().length()==0||name.trim().isEmpty()){
            System.out.println("name can not be empty");
        }else {
            System.out.println("valid ");
        }
    }
}
