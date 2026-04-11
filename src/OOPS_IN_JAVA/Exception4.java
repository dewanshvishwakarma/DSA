package OOPS_IN_JAVA;
class YoungerAge extends RuntimeException{
    YoungerAge(String message){
        super(message);
    }
}

public class Exception4 {
    static void main(String[] args) {
        int age =15;
        if (age<18){
            throw new YoungerAge("you are less than 18");
        }else {
            System.out.println("able to voting");
        }
    }
}
