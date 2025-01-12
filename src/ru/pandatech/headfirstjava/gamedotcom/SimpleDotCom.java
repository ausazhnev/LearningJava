package ru.pandatech.headfirstjava.gamedotcom;

public class SimpleDotCom {
    private int numOfHits = 0;
    private int[] locationCell;

    void setLocationCell(int[] location) {
        locationCell = location;
    }

    String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCell) {
            if (guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCell.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
