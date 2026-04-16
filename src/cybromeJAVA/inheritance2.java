package cybromeJAVA;
class parent{
    void m1(){
        System.out.println("parent class");
    }
}
class child extends parent{
    void m2(){
        System.out.println("child class");
    }
}
public class inheritance2 {
    static void main(String[] args) {
        child c1=new child();
        parent p=new child();
        p.m1();
//        p.m2() no child method class
    }
}
