package cybromeJAVA;
class mm{
    mm(){
        System.out.println("non paramaterised constructor");
    }

    mm(int n){
        System.out.println("onr arg constructor");
    }

    {
        System.out.println("instance block 1");
    }

    {
        System.out.println("instance block 2");
    }
}
public class block {
    static void main(String[] args) {
//        mm t=new mm();
        mm t1= new mm(10);

    }
}
