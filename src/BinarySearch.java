public class BinarySearch {
    public static int binary(int[] a, int key){
        int l=0;
        int h=a.length-1;
        int mid =0;

        while (l<=h){
            mid=(l+h)/2;

            if (key==a[mid]){
                return mid;
            }
            else if (key<a[mid]){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        int[] a={2,4,6,8,10,12,14,16};
        int result=binary(a,14);

        int[] b={2,4,6,8,10,12,15,18,17};
        int result1=binary(b,20);
        System.out.println(result);
        System.out.println(result1);
    }
}
