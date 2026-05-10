import java.util.Scanner;

public class LBP124_delete_given_element {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int del = sc.nextInt();

        boolean found = false;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == del) {
                found = true;
            }
        }

        if(found == false) {
            System.out.print(-1);
            return;
        }

        boolean deleted = false;

        for(int j = 0; j < a.length; j++) {

            if(a[j] == del && !deleted) {
                deleted = true;
                continue;
            }

            System.out.print(a[j] + " ");
        }
    }
}
