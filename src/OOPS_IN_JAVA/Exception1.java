package OOPS_IN_JAVA;

public class Exception1 {
   public static void main(String[] args) {
        try {
            int a=10;
            int b=100;
            int c=a/b;
            System.out.println(c);
            System.out.println("1");
        }
        catch (Exception a){
            System.out.println("devide by zero error ");
        }


    }
}
