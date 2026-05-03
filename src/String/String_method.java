package String;

public class String_method {
    static void main(String[] args) {
        String name="   dewa  nsh";
        String name2="";
        String s1="sanjana";
        String s2="Sanjana";
        String s3="raja";

        System.out.println(name.length());
        System.out.println(name.trim());
        System.out.println(name.trim().length());
        System.out.println(name2.isEmpty());

        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(2));
        System.out.println(s1.substring(4,7));
        System.out.println(s1.contains("jana"));

        System.out.println(s1.startsWith("san"));
        System.out.println(s1.endsWith("ana"));

        System.out.println(s1.replace("a","r"));
        System.out.println(s1.replaceFirst("an","na"));

        System.out.println(s1.indexOf("a"));
        System.out.println(s1.lastIndexOf("a"));

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.concat(s3));



    }
}
