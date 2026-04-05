package OOPS_IN_JAVA;
class Employee{
    int emp_id;
    String name;
   static String company= "sagar institute";

    Employee(int emp_id,String name){
        this.name=name;
        this.emp_id=emp_id;
//        this.company=company;
    }

    void display(){
        System.out.println(name +" "+ company  +" " + emp_id);
    }
}
public class Static {
    public static void main(String[] args){
        Employee E1=new Employee(1,"sanjana");
        E1.display();
        Employee E2=new Employee(2,"dewansh");
        E2.display();

    }
}
