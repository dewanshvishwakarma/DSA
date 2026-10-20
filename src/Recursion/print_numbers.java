package Recursion;

public class print_numbers {
    static void print(int n){
        if (n==0){// base case
            return;
        }
        System.out.println(n);
        print(n-1);// recursive case
    }

    public static void main(String[] args) {
        print(5);
    }

//    Base case:The condition that stops recursion
//    Recursive case:The part where the method calls itself with a smaller or simpler problem
//    recursion tree diagram: how problem broken into sub problem
//    call stack diagram:
}
