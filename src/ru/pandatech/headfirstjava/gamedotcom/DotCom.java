package ru.pandatech.headfirstjava.gamedotcom;

import java.util.ArrayList;

public class DotCom {
    private int numOfHits = 0;
    private ArrayList<String> locationCells = new ArrayList<>();

    public void setLocationCell(int[] loc) {
        for (int num : loc) {
            locationCells.add(Integer.toString(num));
        }
    }

    public String checkYourSelf(String stringGuess) {
        String result = "Мимо";
        int index = locationCells.indexOf(stringGuess);
        if (index >= 0) {
            numOfHits++;
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        System.out.println(result);
        return result;
    }
}
