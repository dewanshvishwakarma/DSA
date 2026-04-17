package cybromeJAVA;
class demo2{
    void add(int a,int b){
        System.out.println("sum is " + (a+b));
    }

    void add(int a , int b,int c){
        System.out.println("sum of this is " + (a+b+c));
    }

    void add(int a, float b){
            System.out.println("sum is = " + a+b);
        }

        //argument match according to widing of type conversion

    void add(float a,float b){
        System.out.println(a+b);
    }
}
public class polymorphism1 {
    static void main(String[] args) {
        demo2 a1=new demo2();
        a1.add('g','g');// exact match call char()
        a1.add(10,50,4);
        a1.add(45,10.5f);

    }
}
