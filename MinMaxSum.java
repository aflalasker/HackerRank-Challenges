public class MinMaxSum {
    static void miniMaxSum(int[] arr) {
        long arrayLength = arr.length;
        long maxValue = arr[0];
        long minValue = arr[0];
        long tempMax = 0;
        long tempMin = 0;
        
        for (int i = 0; i < arrayLength; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        
        for (int i = 0; i < arrayLength; i++) {
            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }
        
        for (int i = 0; i < arrayLength; i++) {
            tempMax = tempMax + arr[i];
            tempMin = tempMin + arr[i];  
        }
        tempMin = tempMin - maxValue;
        tempMax = tempMax - minValue;

        System.out.println(tempMin + " " +tempMax);

    }
}