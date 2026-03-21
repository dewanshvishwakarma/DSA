package OOPS_IN_JAVA;
// this is a variable which point current class  instance variable.
//this is a reference variable that refers to the current object.
//1. To refer current object’s variables

//👉 When local variable & instance variable have same name

public class ThisKeyword {

//    class Student{
//        int age;     // instance variable
//
//        void getData(int age){
//            this.age=age;
//        }
//        void Show(){
//            System.out.println(age);
//        }
//    }

//    2. To call current class method

//    class Test {
//        void show() {
//            System.out.println("Hello");
//        }
//
//        void display() {
//            this.show();  // calling method using this
//        }
//    }

//(Optional) — you can also write just show()


//    3  this keyword use to invoke call current class constructor

//    class Test {
//        Test() {
//            System.out.println("Default");
//        }
//
//        Test(int x) {
//            this();   // calls default constructor
//            System.out.println("Parameterized");
//        }
//    }


//    class Test {
//
//        Test() {
//            System.out.println("A");
//        }
//
//        Test(int x) {
//            this();
//            System.out.println("B");
//        }
//
//        Test(int x, int y) {
//            this(10);
//            System.out.println("C");
//        }
//
//        public static void main(String[] args) {
//            new Test(5, 10);
//        }
//    }



//    4 :

    public  void main(String[] args){
//        Student s= new Student();
//        s.getData(10);
//        s.Show();
//
    }
}


