package ru.pandatech.headfirstjava.dog;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog newDog = new Dog();

        newDog.name = "Тузик";
        newDog.size = 40;
        newDog.bakr();
    }
}
