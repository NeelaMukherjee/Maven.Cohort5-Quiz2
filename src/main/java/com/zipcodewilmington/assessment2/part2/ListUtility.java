package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.List;

public class ListUtility {

    ArrayList <Integer> intList = new ArrayList<>();

    public ArrayList<Integer> getIntList() {

        return intList;
    }

    public void setIntList(ArrayList <Integer> intList) {
        this.intList = intList;
    }



    public Boolean add(int i) {



        intList.add(i);

        return (intList.contains(i));
    }

    public Integer size() {


        return intList.size();
    }

    public List<Integer> getUnique() {


        return null;
    }

    public String join() {

        String result = intList.toString().replace( "[", "").replace( "]", "");

        return result;
    }

    public Integer mostCommon() {


        return null;
    }

    public Boolean contains(Integer valueToAdd) {


        return (intList.contains(valueToAdd));
    }
}
