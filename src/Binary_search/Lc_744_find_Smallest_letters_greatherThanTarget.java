package Binary_search;

public class Lc_744_find_Smallest_letters_greatherThanTarget {
   static public char nextGreatestLetter(char[] letters, char target){
       int n=letters.length;
       int i=0;
       int j=n-1;
       char result=letters[0];

       while (i<=j){
           int mid=i+(j-i)/2;

           if(letters[mid]>target){
               result=letters[mid];
               j=mid-1;
           }else{
               i=mid+1;
           }
       }
       return result;
   }

//apply brute force approach
//    public char nextGreatestLetter2(char[] letters, char target)
}
