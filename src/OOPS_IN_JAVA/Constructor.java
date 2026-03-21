package OOPS_IN_JAVA;
// constructor is an special method in java that automatically calls when an object of that class was cerated
// it is used to initialized data member or variable of an object
// have no any return type void also
//can be overloaded
//type => default,para , copy

public class Constructor {
    class Student {
        int age;
        String name;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void introduce() {
            System.out.println("hello my name is " + name);
            System.out.println("and i am " + age + " year  old");
        }
    }

    public  void main(String[] args) {
        Student s1=new Student("dewansh",15);
        s1.introduce();

    }
}