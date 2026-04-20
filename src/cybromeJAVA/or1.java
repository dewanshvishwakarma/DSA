package cybromeJAVA;
class animal{
    void eat(){
        System.out.println("animal eat food");
    }
}

 class tiger extends animal{
        public void eat(){
            System.out.println("tiger eat flash");
        }
 }

public class or1 {
   public static void main(String[] args) {
       tiger t=new tiger();
       t.eat();
    }

}
