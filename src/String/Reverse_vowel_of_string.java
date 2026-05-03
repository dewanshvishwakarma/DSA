package String;
// leet_code(345)
public class Reverse_vowel_of_string {
    static boolean IsVowel(char c){
        if (c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u'|| c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
            return true;
        }
        return false;
    }


   static String Reverse(String s){
        char[] arr=s.toCharArray();
        int i=0;
        int j= arr.length-1;
        while (i<j){
            if (!IsVowel(arr[i])){
                i++;
            } else if (!IsVowel(arr[j])) {
                j--;
            }else {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
String name="IceCreAm";
String result=Reverse(name);
        System.out.println(result);
    }
}
