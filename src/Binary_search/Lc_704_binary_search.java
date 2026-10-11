package Binary_search;
//https://leetcode.com/problems/binary-search/description/
public class Lc_704_binary_search {

    static   public int search(int[] a, int target) {
        int n=a.length;
        int i=0;
        int j=n-1;
        while(i<-j){
            int mid=i+(j-i)/2;
            if (a[mid]==target){
                return mid;
            }else if(target>a[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
