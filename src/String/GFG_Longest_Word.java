package String;
//Given an array arr[] containing strings of names.
// Your task is to return the longest string.
// If there are multiple names of the longest size, return the first occurring name.
//https://www.geeksforgeeks.org/problems/display-longest-name0853/1?page=2&category=Arrays,Java&difficulty=Basic&sortBy=submissions

public class GFG_Longest_Word {
    static String longest(String[] arr){
        String ans=arr[0];
        for (int i=0;i< arr.length;i++){
            if (ans.length()<arr[i].length()){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
String[] s={"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};
String ans=longest(s);
        System.out.println(ans);

    }
}
