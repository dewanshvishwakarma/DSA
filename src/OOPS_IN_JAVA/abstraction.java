package OOPS_IN_JAVA;

abstract class vehicle{
    abstract void start();
    abstract void aceelerate();
}

class bike extends vehicle{
    void start(){
        System.out.println("bike are start");
    }

    @Override
    void aceelerate() {
        System.out.println("bike are speed up");
    }
}
public class abstraction {
    public static void main(String[] args){
        bike b=new bike();
        b.start();
        b.aceelerate();

    }
}
