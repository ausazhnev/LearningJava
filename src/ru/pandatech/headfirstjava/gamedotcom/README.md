# SimpleDotCom Game

"SimpleDotCom Game" — консольная игра на Java, в которой игрок пытается потопить "сайт", спрятанный в трёх последовательных ячейках виртуального ряда. Цель — угадать все ячейки, затратив как можно меньше попыток.

## Описание
1. Игра случайно размещает "сайт" в ряду с ячейками от 0 до 6.
2. Игрок вводит числа через консоль для угадывания местоположения.
3. Результаты ввода:
    - "Попал" — если догадка совпала с одной из ячеек.
    - "Мимо" — если догадка неверна.
    - "Потопил" — если угаданы все три ячейки.

## Классы
- **SimpleDotCom**: управляет логикой игры.
- **GameHelper**: обрабатывает пользовательский ввод.
- **SimpleDotComGame**: запускает игру и управляет её процессом.
- **SimpleDotComTestDrive**: тестирует логику игры.

## Назначение
Демонстрация основ Java:
- Классы, методы и массивы.
- Обработка пользовательского ввода.
- Логика игры с циклами и случайными числами.
