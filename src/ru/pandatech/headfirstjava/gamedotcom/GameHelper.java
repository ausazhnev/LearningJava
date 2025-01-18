package ru.pandatech.headfirstjava.gamedotcom;

import java.util.Scanner;

public class GameHelper {
    String getUserInput(String message, int maxNum) {
        String userData = null;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Если хотите выйти введите - exit");
        while (true) {
            System.out.print(message);
            userData = userInput.next();

            userData = userData.strip();
            if (userData.equalsIgnoreCase("exit")) {
                break;
            }
            int tmpNum = checkNum(userData);
            if (tmpNum != -1 && tmpNum >= 0 && tmpNum <= maxNum) {
                break;
            }
            System.out.println("Ошибка ввода данных. Повторите попытку.");
        }
//        userInput.close();
        return userData;
    }

    int checkNum (String workSrt) {
        try {
            return Integer.parseInt(workSrt);
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}