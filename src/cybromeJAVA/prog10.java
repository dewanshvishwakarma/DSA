package cybromeJAVA;
class test1{
    int a=10;
    static int b=50;

    void m1(){
        System.out.println(a);
        System.out.println(test1.b);
    }
}
public class prog10 {
    public static void main(String[] args){
        int c;
        test1 t1=new test1();
        test1 t2=new test1();
        test1 t3=new test1();

//        System.out.println(t1.a);
//        System.out.println(test1.b);
//
//        t1.a=10;
//        test1.b=20;
//
//        t2.a=25;
//        test1.b=40;
//
//        t3.a=55;
//        test1.b=50;
//        System.out.println(t1.a);
//        System.out.println(t2.a);
//        System.out.println(t3.a);
//        System.out.println(t2.b);


        t1.m1();

    }
}
