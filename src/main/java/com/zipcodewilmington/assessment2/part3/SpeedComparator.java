package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;

public class SpeedComparator implements Comparator<Animal> {

    public int compare(Animal a1, Animal a2) {

         Integer intVal =0;

        if (a1.getSpeed() > (a2.getSpeed())){

            intVal =-1;

        }

        else if (a1.getSpeed() < (a2.getSpeed())) {

            intVal = 1;
        }


        return intVal;
    }


}
