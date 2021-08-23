package org.arpit.java2blog.pojo;

import java.util.ArrayList;
import java.util.List;

public class Country {
    String name;
    int population;
    private List listOfStates;

    //getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public List getListOfStates() {
        return listOfStates;
    }

    public void setListOfStates(List listOfStates) {
        this.listOfStates = listOfStates;
    }


}
