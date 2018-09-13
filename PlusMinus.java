public class PlusMinus {
    static void plusMinus(int[] arr) {
        
        double numOfPositives = 0.0;
        double numOfNegatives = 0.0;
        double numOfZeros = 0.0;
        
        int lengthOfArray = arr.length;
        
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < 0) {
                numOfNegatives++;
            } else if ( arr[i] > 0) {
                numOfPositives++;
            } else {
                numOfZeros++;
            }
        }
        
        System.out.printf("%.6f \n", numOfPositives/lengthOfArray);
        System.out.printf("%.6f \n", numOfNegatives/lengthOfArray);
        System.out.printf("%.6f \n", numOfZeros/lengthOfArray);

    }
}