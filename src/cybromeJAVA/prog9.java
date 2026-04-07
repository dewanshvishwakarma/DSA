package cybromeJAVA;
class test{
    int a=10;
    static int  b=10;
    void m1(){
        System.out.println(a);
        System.out.println(test.b);
    }
}
public class prog9 {
    public static void main(String[] args) {
        test t1=new test();
        System.out.println(t1.a);
        t1.m1();
    }
}
