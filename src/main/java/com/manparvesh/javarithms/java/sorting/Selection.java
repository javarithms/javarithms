package com.manparvesh.javarithms.java.sorting;

public class Selection {
    public int[] sort(int inputArray[]) {
        int len = inputArray.length;

        if (len < 2) {
            return inputArray;
        }

        int temp; // used for swapping
        for (int i = 0; i < len - 1; i++) {
            int minimumForNow = i;
            for (int j = i + 1; j < len; j++) {
                if (inputArray[j] < inputArray[minimumForNow]) {
                    minimumForNow = j;
                }
            }
            /*
             * swap the first element with the minimum one
             * */
            temp = inputArray[i];
            inputArray[i] = inputArray[minimumForNow];
            inputArray[minimumForNow] = temp;
        }
        return inputArray;
    }
}
