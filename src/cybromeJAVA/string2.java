package cybromeJAVA;
// string are immutable in java , string object are also immutable
public class string2 {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("hello");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        String s3="world";
        String s4="world";
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
