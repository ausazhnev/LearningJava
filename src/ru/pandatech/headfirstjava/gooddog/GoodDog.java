package ru.pandatech.headfirstjava.gooddog;

public class GoodDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int dogSize) {
        size = dogSize;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Гав! Гав!");
        } else if (size > 14) {
            System.out.println("Вуф Вуф!");
        } else {
            System.out.println("Тяф Тяф...");
        }

    }
}
