public class DiagonalDifference {
    static int diagonalDifference(int[][] arr) {

        int n = arr.length;
        System.out.println(n);
        
        int leftToRight = 0;
        int rightToLeft = 0;
        for (int i = 0; i < n; i++) {
            rightToLeft += arr[i][n-i-1];
            leftToRight += arr[i][i];
        }        
        return Math.abs(leftToRight-rightToLeft);
    }
}