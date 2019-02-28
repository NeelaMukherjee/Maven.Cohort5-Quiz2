package com.zipcodewilmington.assessment2.part2;

import java.util.Map;
import java.util.TreeMap;

public class Router {


    Map <String, String> router = new TreeMap<>();

    public void add(String path, String controller) {


        router.put(path, controller);

    }

    public Integer size() {


        return router.size();
    }

    public String getController(String path) {


        return router.get(path);
    }

    public void update(String path, String studentController) {

        if (router.containsKey(path)){

            router.replace(path, studentController);

        }


    }

    public void remove(String path) {

        router.remove(path);
    }

    public String toString (){

        StringBuilder sb = new StringBuilder();


        for(Map.Entry<String,String> entry : router.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            sb.append(key + " -> " +value+"\n");

        }
        return  sb.toString();
    }
}
