package edu.itstep.run;

public class SearchEngine {

    public int linearSearch(int searchValue, int[] array) {
        for (int i = 0; i < array.length; i++) {

            if (searchValue == array[i]) return 0;
        }

        return -1;
    }


}
