package ru.pandatech.headfirstjava.gooddog;

public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoodDog oneDog = new GoodDog();
        oneDog.setSize(79);
        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("Первая собака: " + oneDog.getSize());
        oneDog.bark();

        System.out.println("Вторая собака: " + two.getSize());
        two.bark();
    }
}
