public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int numberOfPairs = 0;
        Arrays.sort(ar);
        
        for (int i = 0; i < n-1; i++) {
            if ( i < n && ar[i] == ar[i+1] ) {
                numberOfPairs++;
                i = i + 1;
            }
        }
        
        return numberOfPairs;
    }

}