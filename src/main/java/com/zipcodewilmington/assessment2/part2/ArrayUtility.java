package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {


    public Integer[] merge(Integer[] array1, Integer[] array2) {


        int alen = array1.length;

        int blen = array2.length;

        Integer[] intarray = new Integer[alen + blen];

        for (int i = 0; i < alen; i++) {

            intarray[i] = array1[i];
        }

        for (int i = alen, j = 0; i < alen + blen; i++) {

            intarray[i] = array2[j];

            j++;
        }


        return intarray;

    }

    public Integer[] rotate(Integer[] array, Integer index) {


        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer count1 = countOccurrence1(array1, valueToEvaluate);
        Integer count2 = countOccurrence1(array2, valueToEvaluate);

        return (count1 + count2);

    }

    public Integer mostCommon(Integer[] array) {

        int len = array.length;

        Integer result = 0;

        Integer[] array1 = (Integer[]) array;
        if (len > 1) {

            for (int i = 0; i < len; i++) {

                array1[array1[i] % len] += len;
            }

            int max = array1[0]; //result = 0;

            for (int j = 1; j < len; j++) {

                if (array1[j] > max) {
                    max = array1[j];
                    result = j;

                }
            }

        } else {

            result = array[0];

        }

        return result;

    }

    public Integer countOccurrence1(Integer[] array1, Integer valueToEvaluate) {

        int occur = 0;
        int len = array1.length;

        for (int i = 0; i < len; i++) {

            if (array1[i].equals(valueToEvaluate)) {

                occur++;
            }
        }
        return occur;

    }
}
