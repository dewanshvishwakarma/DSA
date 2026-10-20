package Binary_search;

public class LC_240_search_in_2d_ii {
    //Staircase Search approach
    static boolean searchMatrix(int[][] matrix, int target){
        int m= matrix.length;
        int n=matrix[0].length;
        int i=0;
        int j=n-1;
        while (i<m && j>=0){
            if (matrix[i][j]>target){
                j--;
            }else if(matrix[i][j]<target){
                i++;
            }else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a={{1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}};

        boolean ans=searchMatrix(a,30);
        System.out.println(ans);
    }
}
