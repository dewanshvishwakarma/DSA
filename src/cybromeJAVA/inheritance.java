package cybromeJAVA;
class A{
    void m1(){
        System.out.println("a class meathod");
    }
}

class B extends A{
    void m2(){
        System.out.println("b class meathod");
    }
}

class C extends B{
    void m3(){
        System.out.println("C class meatho");
    }
}
public class inheritance {
    static void main(String[] args) {
        C s1=new C();
        s1.m3();
        s1.m1();
        s1.m2();
    }
}
