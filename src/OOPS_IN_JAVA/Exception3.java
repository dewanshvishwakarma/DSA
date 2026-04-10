package OOPS_IN_JAVA;
//finally block

/*  */
public class Exception3 {
    static void main(String[] args) {
        try {
            int a=20;
            int b=0;
            int c=a/b;
        }
        catch(Exception e){
            System.out.println("devide by zero");
        }
        finally {
            System.out.println(" i am an finally block");
        }
    }
}
/* use to write
 Closing Resources (Most Important)
Used to close:

Files
Database connections
Network connections
Scanner
 */
