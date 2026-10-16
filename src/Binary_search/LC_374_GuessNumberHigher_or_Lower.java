package Binary_search;
//https://leetcode.com/problems/guess-number-higher-or-lower/
public class LC_374_GuessNumberHigher_or_Lower {
    static public int guessNumber(int n){
        int i=0;
        int j=n;
        while(i<=j){
            int mid=i+(j-i)/2;
            int result=guess(mid);
            if (result==mid){
                return mid;
            } else if (result==1) {
                i=mid+1;
            }else {
                j=mid-1;
            }
        }
        return -1;
    }

}
