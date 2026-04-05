package OOPS_IN_JAVA;
class  PersonP1{
private String name;

public void setName(String name){
    this.name=name;
}

public String getName (){
 return name;
}
}
public class encapsulation {
    public static void  main(String[] args){
        PersonP1 s=new PersonP1();
        s.setName("dewansh vishwakarma");
        System.out.println(s.getName());
    }
}
