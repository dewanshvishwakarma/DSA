    class MyThread extends Thread{
        public void run(){
            System.out.println("thread is running");
        }
    }
public class thread1 {
    public static void main(String[] args) {
        MyThread m=new MyThread();
        m.start();
    }
}
