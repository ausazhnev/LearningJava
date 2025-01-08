package ru.pandatech.headfirstjava.rasegenerator;

public class RaseGenerator {
    public static void main(String[] args) {
        String[] firstWorldList = new String[]{"круглосуточный", "трех-звенный", "30000-футовый", "взаимный",
                "обоюдный выйгрыш", "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сигм",
                "метод критичного пути", "динамичный"};
        String[] secondWorldList = new String[]{"уполномоченный", "трудный", "чистый продукт", "ориентированный",
                "центральный", "распределенный", "кластеризованный", "фирменный", "нестандартный ум",
                "позиционированный", "сетевой", "сфокусированный", "использованный с выгодой", "выровненный",
                "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] thirdWorldList = new String[]{"процесс", "пункт загрузки", "выход из положения", "тип структуры",
                "талант", "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор", "образец",
                "пункт следования"};

        int firstListLength = firstWorldList.length;
        int secondListLength = secondWorldList.length;
        int thirdListLength = thirdWorldList.length;

        int rnd1 = (int) (Math.random() * firstListLength);
        int rnd2 = (int) (Math.random() * secondListLength);
        int rnd3 = (int) (Math.random() * thirdListLength);

//        String phrase = firstWorldList[rnd1] + " " + secondWorldList[rnd2] + " " + thirdWorldList[rnd3];
//        System.out.println(phrase);
        System.out.printf("%s %s %s", firstWorldList[rnd1], secondWorldList[rnd2], thirdWorldList[rnd3]);
    }
}
