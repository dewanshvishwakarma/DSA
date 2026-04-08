package cybromeJAVA;
class test2{
    void m1(){
        System.out.println("hello i am the m1 method");
    }

    void m2( float f){
        System.out.println("i am method 2 ");
    }

}

public class prog11 {
    public static void main(String[] args){
        test2 t1=new test2();
        t1.m1();
        t1.m2(10.5f);  // by default decimal value is double
        t1.m2('c');

    }
}
