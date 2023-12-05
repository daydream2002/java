package leetcode;

import java.util.Arrays;

/**
 * @author wjh
 * @date 2023/12/4 17:48
 */
public class no_48 {
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public static void rotate(int[][] matrix) {
        int len = matrix.length / 2 * 2;
        int temp ;
        for (int loop=0;loop<len;loop++) {
            for (int i = 0; i < matrix.length-1-2*loop; i++) {
                int x = loop, y = loop;
                temp=matrix[x][y];
                while (x < matrix.length-1-loop)
                    matrix[x][y]=matrix[++x][y];
                while (y<matrix.length-1-loop)
                    matrix[x][y]=matrix[x][++y];
                while (x>0+loop)
                    matrix[x][y]=matrix[--x][y];
                while (y>1+loop)
                    matrix[x][y]=matrix[x][--y];
                matrix[x][y]=temp;
            }
        }
    }
}
