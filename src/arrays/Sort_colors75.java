package arrays;

public class Sort_colors75 {
    static void sort_color1(int[] a){
        int count0=0;
        int count1=0;
        int count2=0;
        for (int i=0;i<a.length;i++){
            if (a[i]==0){
                count0++;
            }else if (a[i]==1){
                count1++;
            }else{
                count2++;
            }
        }
        int index = 0;

// fill 0s
        while (count0 > 0) {
            a[index] = 0;
            index++;
            count0--;
        }

// fill 1s
        while (count1 > 0) {
            a[index] = 1;
            index++;
            count1--;
        }

// fill 2s
        while (count2 > 0) {
            a[index] = 2;
            index++;
            count2--;
        }
    }

    static void sort_color2(int[] a){
        int s=0;
        int m=0;
        int e= a.length-1;

        while (m<=e){
            if (a[m]==0){
                int temp=a[m];
                a[m]=a[s];
                a[s]=temp;
                s++;
                m++;
            }
            else if (a[m]==1){
                m++;
            }
           else{
                int temp=a[m];
                a[m]=a[e];
                a[e]=temp;
                e--;
            }
        }
    }
    static void print(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]+ " ");
        }
    }
    public static void main(String[] args){
        int[] a={0,1,0,2,2,0,1,1};
        sort_color2(a);
        print(a);

    }
}
