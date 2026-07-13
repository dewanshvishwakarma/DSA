package pattern;

public class inverted_number_RAP {
    static  void pattern(int n){
        for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern(5);
    }
}
