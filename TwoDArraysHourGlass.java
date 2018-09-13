public class TwoDArraysHourGlass {
    static int hourglassSum(int[][] arr) {
        
        int maxValue = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                if ( row >= arr.length - 2 || col >= arr.length - 2) {
                } else {
                    int temp = 0;
                    int rowOne = arr[row][col] + arr[row][col + 1] + arr[row][col + 2];
                    int rowTwo = arr[row + 1][col+ 1 ];
                    int rowThree = arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
                    temp = rowOne + rowTwo + rowThree;
                    if ( temp > maxValue ) {
                        maxValue = temp;
                    }
                }  
            }
        }
        return maxValue;
    }
}