package ru.pandatech.headfirstjava.gamedotcom;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] location = {2, 3, 4};
        dot.setLocationCell(location);

        String userGuess = "2";

        String result = dot.checkYourSelf(userGuess);
        String testResult = "Неудача";

        if (result.equals("Попал")) {
            testResult = "Пройден";
        }
        System.out.println(testResult);
    }
}
