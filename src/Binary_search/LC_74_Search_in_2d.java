package Binary_search;

public class LC_74_Search_in_2d {

//use brute force
    static boolean search(int[][] a,int target){
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[0].length;j++){
                if (a[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }



}
