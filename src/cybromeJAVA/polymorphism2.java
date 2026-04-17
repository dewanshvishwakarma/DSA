package cybromeJAVA;
class p{
    void m1(int a){
        System.out.println("m1");
    }
}

class c extends p{
    void m2(int a,int b){
        System.out.println("m2");
    }
    void m3(int a,int b,int c){
        System.out.println("m3");
    }
}
public class polymorphism2 {
    c c1=new c();
    p p2=new c();
    p2.m1(10)
}
