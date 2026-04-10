package OOPS_IN_JAVA;

public class Exception2 {
    static void main(String[] args) {
        try {
            int a=20;
            int b=0;
            int c=a/b;

        }
        catch (Exception e){
            System.out.println("*******************************");
            System.out.println(e);
            System.out.println("*******************************");
            System.out.println(e.toString());
            System.out.println("*******************************");
            e.printStackTrace();
            System.out.println("*******************************");
            System.out.println(e.getMessage());
        }
    }
}
