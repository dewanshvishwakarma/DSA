package OOPS_IN_JAVA;
interface person{
    int roll=10;

  public  void intro();
   public void display();

}
class student implements person{
  public   void intro(){
        System.out.println("my name is dewansh");
    }
   public void display(){
        System.out.println("hello");
    }
}
public class Interface {
    public static void main(String[] args){
        student s1=new student();
        s1.display();
        s1.intro();
    }
}
