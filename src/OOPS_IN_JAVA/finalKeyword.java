package OOPS_IN_JAVA;
//The final keyword in Java is a non-access modifier used to restrict changes.

// It can be applied to:
//Variables → value cannot be changed
//Methods → cannot be overridden
//Classes → cannot be inherited


final class Demo{
    void get(){
        System.out.println("enter the name ");
    }
}
//class Demo2 extends Demo{  (error can not extend final class)
//
//}
public class finalKeyword {
    public static void main(String[] argsS){
        final int x=10;
//        x=10+x;  ( give error)
        System.out.println(x);
    }
}

