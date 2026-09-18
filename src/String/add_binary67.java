package String;

public class add_binary67 {
    public String addBinary(String a, String b){
        int i=a.length();
        int j=b.length();
        int carry=0;

        while (i>=0 && j>=0 && carry!=0){
            int f=a.charAt(i);
            int s=b.charAt(j);
            int sum=f+s;
            if (sum==10){
                carry=1;
                int result=sum%10;
            }
        }
    }
    public static void main(String[] args){

    }
}
