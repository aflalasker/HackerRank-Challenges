public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {

        int lengthOfArray = ar.length;
        int tallestCandle = ar[0];
        int numberOfTallCandles = 0;
        
        for ( int i = 0; i < lengthOfArray; i++ ) {
            if ( tallestCandle < ar[i] ) {
                tallestCandle = ar[i];
            }
        }
        
        for (int i = 0; i < lengthOfArray; i++) {
            if ( ar[i] == tallestCandle ) {
                numberOfTallCandles++;
            }
        }
        
        return numberOfTallCandles;

    }
}