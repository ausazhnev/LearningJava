package ru.pandatech.headfirstjava.movie;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Как прогореть на акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Потерянные в офисе";
        two.genre = "Комедия";
        two.rating = 5;

        Movie three = new Movie();
        three.title = "Терминатор 2";
        three.genre = "Боевик";
        three.rating = 98;

        three.playIt();
        System.out.printf("Инфо о фильме: %s\n" +
                "жанр: %s\n" +
                "Рейтинг: %s",
                three.title, three.genre, three.rating);

    }
}
