package ru.pandatech.headfirstjava.poordog;

public class PoorDogTestDrive {
    public static void main(String[] args) {
        PoorDog one = new PoorDog();
        System.out.println("Возраст собаки: " + one.getSize());
        System.out.println("Имя собаки: " + one.getName());
        System.out.println("Домашняя: " + one.getDomestic());
        System.out.println("Вес собаки: " + one.getWeight());

    }
}
