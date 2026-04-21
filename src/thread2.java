class test implements Runnable{
    public void run(){
        System.out.println("thread by runnable method");
    }
}
public class thread2 {
     public static void main(String[] args) {
        test t=new test();
        Thread th=new Thread(t);
        th.start();
    }
}
