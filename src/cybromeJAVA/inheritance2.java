package cybromeJAVA;
class parent{

    parent(){
        System.out.println(" hellp parent");
    }
    void m1(){
        System.out.println("parent class");
    }
}

class child extends parent{

    child(){
        System.out.println("child");
    }
    void m2(){
        System.out.println("child class");
    }
}
public class inheritance2 {
   public static void main(String[] args) {
        child c=new child();


//        child c1=new child();
//        parent p=new child();
//        p.m1();
//        p.m2() no child method class
    }
}
