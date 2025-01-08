package ru.pandatech.headfirstjava.beersong;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word;

        while (beerNum > 0) {
            word = getWord(beerNum);
            System.out.printf("%d %s пива на стене%n", beerNum, word);
            System.out.printf("%d %s пива", beerNum, word);
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum -= 1;
        }
        System.out.println("Нет бутылок пива на стене.");
    }

    public static String getWord(int num) {
        if (num % 10 == 1) {
            return "бутылка";
        } else if (num % 10 >= 2 && num % 10 <= 4) {
            return "бутылки";
        }
        return "бутылок";
    }
}
