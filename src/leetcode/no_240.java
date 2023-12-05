package leetcode;

import java.util.Arrays;

/**
 * @author wjh
 * @date 2023/12/4 20:01
 */
public class no_240 {
    public static void main(String[] args) {
       int[][]  matrix = {{4,5},{4,6},{9,14},{10,15}};
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
        System.out.println(searchMatrix(matrix,7));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length,n= matrix[0].length,x=0,y=0;
        for (int i = 0; i < m; i++) {
            if (matrix[i][0]==target)
                return true;
            if (matrix[i][0]<target)
                x=i;
        }
        for (int i = 0; i < n; i++) {
            if (matrix[0][i]==target)
                return true;
            if (matrix[0][i]<target)
                y=i;
        }
        System.out.println(x+" "+y);
        if (matrix[x][y]==target)
            return true;
        for (int i = x; i>0; i--) {
            int j=1;
            if (j>=matrix[i].length)
                break;
            while (true){
                if (matrix[i][j]==target)
                    return true;
                System.out.println(j);
                if (matrix[i][j]>target||j==matrix[i].length-1)
                    break;
                j++;
            }
        }
        System.out.println(x+" "+y);
        return false;
    }
}
