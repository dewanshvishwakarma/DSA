package Binary_search;

public class LC_35_search_insert_position {
    static public int searchInsert(int[] a, int target){
        int n=a.length;
        int i=0;
        int j=n-1;

        while (i<=j){
            int mid=i+(j-i)/2;

            if(a[mid]==target){
                return mid;
            }else if(target>a[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] a={1,3,5,6};
        int ans=searchInsert(a,2);
        System.out.println(ans);
    }
}
