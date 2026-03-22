package OOPS_IN_JAVA;

// in java there is only 3 type of inheritance
//single,multilevel,hierarchical

public class Inheritance {
    class Animal{
        void show(){
            System.out.println("i am a base class ");
        }
    }

    class dog extends Animal{
        void show1(){
            System.out.println("i am a derived class ");
        }
    }




//    multilevel

    class A{
        void display(){
            System.out.println(" i am base class");
        }
    }
    class B extends A{
        void display1(){
            System.out.println(" i am intermediate class derived from class A");
        }
    }
    class C extends B{
        void display2(){
            System.out.println(" i am derived class from class B");
        }
    }


//    hierarchical => one parent multiple child
    public  void main(String[] args){
        dog d1=new dog();
        d1.show1();
        d1.show();

        C c1=new C();
        c1.display();
        c1.display1();
        c1.display2();
    }
}
