package leetcode;

/**
 * @author wjh
 * @date 2024/2/2 14:51
 */
public class no_70 {
    public static void main(String[] args) {
        int ans = climbStairs(1);
        System.out.println(ans);
    }
    public static int climbStairs(int n) {
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        int[] ints = new int[n+1];
        ints[1]=1;
        ints[2]=2;
        int i=3;
        while (i<=n){
            ints[i]=ints[i-1]+ints[i-2];
            i++;
        }
        return ints[n];
    }
}
