package cybromeJAVA;
class test4{
    test4(int a){
        System.out.println("i am a parameter constructor");
    }

    test4(int a,float d){
        System.out.println("i am an 2 parameter constructor");
    }
}
public class cons1 {
    static void main(String[] args) {
        test4 t1=new test4(4);
        test4 t2=new test4(10,10.2f);
    }
}
