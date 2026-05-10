public class LBP127_reverse_array {
    static void reverse(int[] a){
        int n=a.length;
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }

    }
    static void main(String[] args) {
        int[] a={10,20,30,40,50};
        reverse(a);
        for (int i=0;i< a.length;i++){
            System.out.print(a[i] + " ");
        }

    }
}
