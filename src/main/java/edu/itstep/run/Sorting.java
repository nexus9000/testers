package edu.itstep.run;

public class Sorting {
    public static int[] bubbleSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isSorted = true;//improvement of the bubble sort if already sorted
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            if (isSorted) break;

        }


        return array;
    }
}
