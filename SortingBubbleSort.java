public class SortingBubbleSort {
    static void countSwaps(int[] a) {
        int numberOfSwaps = 0;

        for (int lastUnsortedIndex = 0; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (a[i] == a[i+1]) {
                    numberOfSwaps++;
                    swap(a, i, i+1);
                }
            }
        }

        System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length -1]);
    }

    static void swap(int[] a, int i, int j) {
        if (a[i] == a[j]) {
            return;
        }

        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}