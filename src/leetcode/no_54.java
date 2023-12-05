package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author wjh
 * @date 2023/12/2 13:45
 */
public class no_54 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        List<Integer> list = spiralOrder(matrix);
        System.out.println(list);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        int x1 = matrix.length - 1, y1 = matrix[0].length - 1, i = 0, j = 0, x0 = 0, y0 = 0;
        list.add(matrix[0][0]);
        while (true) {
            while (j < y1) {//j<2
                list.add(matrix[i][++j]);
            }
            x0++;
            if (x0 > x1)
                break;
            while (i < x1) {
                list.add(matrix[++i][j]);
            }
            y1--;
            if (y1 < y0)
                break;
            while (j > y0) {
                list.add(matrix[i][--j]);
            }
            x1--;
            if (x1 < x0)
                break;
            while (i > x0) {
                list.add(matrix[--i][j]);
            }
            y0++;
            if (y0 > y1)
                break;
        }
        return list;
    }
}
