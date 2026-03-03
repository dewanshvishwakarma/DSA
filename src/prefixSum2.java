import java.util.Scanner;
//Q check if we partition an array into two sub array with equal sum check weather the prefix sum of array is equal to suffix sum
public class prefixSum2 {
    static int SUM(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    static boolean partitionArray(int[] pre) {
        int total = SUM(pre);
        int prefixSum = 0;
        for (int i = 0; i < pre.length; i++) {
            prefixSum = prefixSum + pre[i];
            int suffixsum = total - prefixSum;
            if (suffixsum == prefixSum) {
                return true;
            }

        }
        return false;
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
//        int[] aray={1,2,3,4,5};
//        System.out.println(SUM(aray));
            System.out.println("enter the size of an array");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("enter the " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("equal partition possible " + partitionArray(arr));
        }
    }
