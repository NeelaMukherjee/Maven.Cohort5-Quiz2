package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        return (array.length % 2 ==0);
    }

    public Integer[] range(int start, int stop) {

        Integer [] range1 = new Integer[stop-start +1];

        for (int i= start, j=0; i<=stop; i++){

            range1 [j] = i;
            j++;
        }

        return range1;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

        return (array [0] +array[1]);
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

    return (array[0]*array[1]);
    }
}
