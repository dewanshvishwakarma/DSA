package arrays;

public class CheckSorted {
    static boolean sorted(int[] a){
        boolean check=true;
        for(int i=0;i<a.length-1;i++){
            if (a[i]>a[i+1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5,6};
        boolean output=sorted(a);
        if (output){
            System.out.println("yes array is sorted ");
        }else{
            System.out.println("array is not sorted ");
        }
    }
}
