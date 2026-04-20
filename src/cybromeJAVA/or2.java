package cybromeJAVA;
class Animal{
    void fun(){
        System.out.println("animal class method");
    }

}
class Tiger extends Animal{
    void fun2(){
        System.out.println("tiger class method");
    }
}

class a{
    Animal m1(){
        return new Animal();
    }
}
class b extends  a{
    Tiger m1(){
        return new Tiger();
    }
}
public class or2 {
    public static void main() {
        b b1=new b();
        Tiger t= b1.m1();
        t.fun();
    }
}
