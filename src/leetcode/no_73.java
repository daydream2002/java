package leetcode;

import java.util.Arrays;

/**
 * @author wjh
 * @date 2023/12/1 20:23
 */
public class no_73 {
    public static void main(String[] args) {
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(arr);
        for (int[] ints : arr) {
            System.out.println(Arrays.toString(ints));
        }
    }
    public static void setZeroes(int[][] matrix) {
        int len = matrix.length;
        int wight = matrix[0].length;
        int[] lenarr=new int[len];
        int[] wightarr=new int[wight];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    lenarr[i]=1;
                    wightarr[j]=1;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (lenarr[i]==1)
                    matrix[i][j]=0;
                if (wightarr[j]==1)
                    matrix[i][j]=0;
            }
        }
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

}

