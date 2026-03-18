package OOPS_IN_JAVA;

public class BasicOOP {
   static class Person{
        int age;
        String name;

        void display(){
            System.out.println("my name is " + name);
            System.out.println("and my age is : " + age);
        }

    }
    public static void main(String[] args){
        Person p1= new Person();
        p1.age=18;
        p1.name="dewansh";
        p1.display();

    }
}
