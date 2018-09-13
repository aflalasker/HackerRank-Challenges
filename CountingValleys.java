public class CountingValleys {
    static int countingValleys(int n, String s) {
        
        int sealevel = 0;
        int numberOfValleyHiked = 0;
        
        char[] letters = s.toCharArray();
        
        for (int i = 0; i < letters.length - 1; i++) {
            if ( letters[i] == 'U' ) {
                sealevel++;
            } else if ( letters[i]  == 'D') {
                sealevel--;
                if ( sealevel == -1 ) {
                    numberOfValleyHiked++;
                }
            }  
        }
        return numberOfValleyHiked;
    }
}