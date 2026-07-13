package pattern;

public class right_angle_traingle_1_to_row {

    static void triangle(int n){
        for (int i=1 ;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        triangle(5);
//        output
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
    }
}
