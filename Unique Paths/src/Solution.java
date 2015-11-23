public class Solution {
    public int uniquePaths(int m, int n) {

        if (m < n) {
            temp = new int[m + n - 1][m];
            return c(m + n - 2, m - 1);
        } else {
            temp = new int[m + n - 1][n];
            return c(m + n - 2, n - 1);
        }
    }

    private int c(int m, int n) {

        if (n == 0 || m == n) {
            return 1;
        }
        if (temp[m][n] != 0) {
            return temp[m][n];
        } else {
            temp[m][n] = c(m - 1, n - 1) + c(m - 1, n);
            return temp[m][n];
        }
    }

    private int[][] temp;

    public static void main(String[] args) {
        System.out.println(new Solution().uniquePaths(3, 3));
    }
}