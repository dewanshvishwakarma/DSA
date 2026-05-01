package arrays;

public class Sort_two_color {
//   approach:1 apply brute force , with the help of count , count the 0 and 1 and fill the array
    static void Sort_color1(int[] a){
        int n=a.length;
        int count0=0;
        for (int i=0;i<n;i++){
            if (a[i]==0){
                count0++;
            }
        }
        for (int j=0;j<n;j++){
            if (j<count0){
                a[j]=0;
            }else{
                a[j]=1;
            }
        }
    }
//   approach:2 apply optimal approach two pointer i and j are in first if j=0; swap them and i++
    static void Sort_color2(int[] a){
        int i=0;
        for (int j=0;j< a.length;j++){
            if (a[j]==0){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
            }
        }
        }
//  with two pointer approach:3
     static void Sort_color3(int[] a){
        int n=a.length;
        int i=0;
        int j=n-1;
        while (i<=j){
            if (a[i]==0){
                i++;
            }
            else{
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j--;
            }
        }
     }
    static void print(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+ " ");
        }
    }

    public static void main (String[] args){
int[] a={0,1,1,1,0,1};
//Sort_color1(a);
//print(a);
Sort_color2(a);
print(a);
//        Sort_color3(a);
//        print(a);
    }
}

