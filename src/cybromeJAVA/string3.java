package cybromeJAVA;
// understand (==) and .equal to
//== compares references (memory location)
//It checks whether two variables point to the same object.
// .equals() compares content/value
//It checks whether two objects have the same value/content.
public class string3 {
    public static void main(String[] args) {

    String s1="sanjana";
    String s2=("sanjana");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3= new String("dewansh");
        String s4= new String("dewansh");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
    }

}
