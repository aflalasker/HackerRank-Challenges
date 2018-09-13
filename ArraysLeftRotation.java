public class ArraysleftRotation {
    static int[] rotLeft(int[] a, int d) {

        int[] temp = new int[d];
        for (int i = 0 ; i < d; i++) {
            temp = shiftElements(a);
        }
        return temp;
    }
    
    static int[] shiftElements(int[] array) {
        
            for(int i = 0; i < array.length; i++) {
                int firstElement = array[0];
                
                if (array[i] == firstElement) {
                    for ( int j = i; j < array.length - 1; j++ ) {
                        array[j] = array[j+1];
                    }
                    array[array.length-1] = firstElement;
                    break;
                }
            }
        
        return array;  
    }
}