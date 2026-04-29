package cybromeJAVA;
class clg{
    void studentInfo() throws InterruptedException{
        System.out.println("dewansh is sleeping");
        Thread.sleep(2000);
    }
    void HOD() throws InterruptedException{
        studentInfo();
    }

    void Director(){
        try{
            HOD();
        }
        catch (InterruptedException ae){
            System.out.println("exception handeled");
        }
    }

    void Assistent(){
        Director();
    }
}
public class Eh1 {
    static void main(String[] args) {
        clg c=new clg();
        c.Assistent();
    }
}
