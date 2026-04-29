package cybromeJAVA;

// un checked exception by default pass to main method (jvm) to handel
// while checked are explicitly throws to caller method
class clg2{
    void Student(){
        System.out.println("hello dewansh vishwakarma");
        System.out.println(10/0);
    }
    void HOD(){
        Student();
    }
    void Director(){
        HOD();
    }
    void assistent(){
        Director();
    }
}
public class eh2 {
    static void main(String[] args) {
        clg2 c=new clg2();
        try {
            c.assistent();
        }catch (Exception e){
            System.out.println("devision by zero exception");
        }
    }
}

