package com.zipcodewilmington.assessment2.part2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class ListUtility {

    ArrayList<Integer> intList = new ArrayList<>();

    public ArrayList<Integer> getIntList() {

        return intList;
    }

    public void setIntList(ArrayList<Integer> intList) {
        this.intList = intList;
    }


    public Boolean add(Integer i) {


        return intList.add(i);

        //return (intList.contains(i));
    }

    public Integer size() {


        return intList.size();
    }

    public List<Integer> getUnique() {

        return (ArrayList) intList.stream().distinct().collect(Collectors.toList());

    }

    public String join() {

        String result = intList.toString().replace("[", "").replace("]", "");

        return result;
    }

    public Integer mostCommon() {
        Integer mostOccurences = intList.get(0);

        for(Integer i : intList){
            if(Collections.frequency(intList,i) > Collections.frequency(intList,mostOccurences)){
                mostOccurences = intList.get(i);
            }
        }
        return mostOccurences;
    }



        public Boolean contains(Integer valueToAdd) {


            return (intList.contains(valueToAdd));
        }
    }



