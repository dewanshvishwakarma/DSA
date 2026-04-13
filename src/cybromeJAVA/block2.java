package cybromeJAVA;
class demo1{
    static {
        System.out.println("static block 2");
    }
    demo1(){
        System.out.println("no arg constructor");
    }

    demo1(int a){
        System.out.println("one arg constructor");
    }

    {
        System.out.println("istance block 1");
    }

    {
        System.out.println("instance block 2");
    }
    static {
        System.out.println("static block 1");
    }

}
public class block2 {
    static void main(String[] args) {
        demo1 d1=new demo1();
        demo1 d2=new demo1(10);

    }
}
