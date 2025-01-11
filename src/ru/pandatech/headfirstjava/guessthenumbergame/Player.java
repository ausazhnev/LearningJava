package ru.pandatech.headfirstjava.guessthenumbergame;

public class Player {
    int number = 0;
    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.printf("Думаю, что это число: %d%n", number);
    }
}
