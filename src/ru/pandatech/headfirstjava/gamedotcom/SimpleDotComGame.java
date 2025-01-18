package ru.pandatech.headfirstjava.gamedotcom;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        byte maxNum = 6;
        GameHelper halper = new GameHelper();
        DotCom theDotCom = new DotCom();

        int randomNum = (int) (Math.random() * 5);

        int[] location = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCell(location);

        System.out.println("Игра началась.");
        boolean isAlive = true;
        while (isAlive) {
            String guess = halper.getUserInput("Введите число от 0 до 6: ", maxNum);
            if (guess.equalsIgnoreCase("exit")) {
                System.out.println("Досрочное завершение игры.");
                break;
            }
            String result = theDotCom.checkYourSelf(guess);
            numOfGuesses++;

            if (result.equalsIgnoreCase("потопил")) {
                isAlive = false;
                System.out.println("Вы победили!!!");
                System.out.printf("Вам потребовалось %d попыток(и)", numOfGuesses);
            }
        }

    }
}
