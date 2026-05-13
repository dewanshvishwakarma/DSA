import java.util.Scanner;

public class LBP131_sort_0_1_2 {

    static void sort_012(int[] a){
        int n=a.length;
        int i=0;
        int j=n-1;
        int k=0;
        while (k<=j){
            if(a[k]==0){
                int temp=a[i];
                a[i]=a[k];
                a[k]=temp;
                i++;
                k++;
            } else if (a[k]==2) {
                int temp=a[j];
                a[j]=a[k];
                a[k]=temp;
                j--;
            }else {
                k++;
            }
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] a=new int[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
//        int i=0;
//        int j=a.length-1;
//        int k=0;
//
//        while(k<=j){
//            if (a[k]==0){
//                int temp=a[i];
//                a[i]=a[k];
//                a[k]=temp;
//                i++;
//                k++;
//            }else if(a[k]==2){
//                int temp=a[j];
//                a[j]=a[k];
//                a[k]=temp;
//                j--;
//
//            }else{
//                k++;
//            }
//        }
//
//        for (int m=0;m<a.length;m++){
//            System.out.println(a[m] + " ");
//        }



        sort_012(a);
        for (int j=0;j<a.length;j++){
            System.out.println(a[j] + " ");
        }

    }
}
