package cybromeJAVA;
class Student{
    Student(){
        this(10);
        System.out.println(" i am an no parameter constructor");
    }

    Student(int a){
        this(10,15f);
        System.out.println(" i am an 1 parameter constructor");
    }

    Student(int a ,float b){
        System.out.println(" iam an 2 parameter constructor");
    }
}

public class Constructor_chaining {
    static void main(String[] args) {
        Student s=new Student();

    }
}
