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

    //Staircase Search

   static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=n-1;

        while(i<m && j>=0){
            if(matrix[i][j]>target){
                j--;
            }else if(matrix[i][j]<target){
                i++;
            }else{
                return true;
            }
        }
        return false;
    }



}
