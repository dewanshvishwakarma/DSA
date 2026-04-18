package cybromeJAVA;
class test3{
    void add(int...x){
        System.out.println("var arug");
    }
}
public class Var {
    static void main(String[] args) {
        test3 t=new test3();
        t.add(10,52,15,42);
    }
}
