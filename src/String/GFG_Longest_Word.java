package String;
//Given an array arr[] containing strings of names.
// Your task is to return the longest string.
// If there are multiple names of the longest size, return the first occurring name.

//
public class GFG_Longest_Word {
    public String longest(String[] arr){
        String ans=arr[0];
        for (int i=0;i< arr.length;i++){
            if (ans.length()<arr[i].length()){
                ans=arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
