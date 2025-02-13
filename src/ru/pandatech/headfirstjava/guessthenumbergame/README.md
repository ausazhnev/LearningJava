# Пакет GuessGame

Этот пакет содержит игру "Угадай число", в которой три игрока пытаются угадать случайное число от 0 до 9. Игра демонстрирует основы объектно-ориентированного программирования (ООП) в Java, включая работу с классами, атрибутами и методами.

## Описание классов

### Player
Класс `Player` представляет игрока и содержит:
- **Атрибуты**:
    - `number` (int): число, которое загадал игрок.
- **Методы**:
    - `guess()`: генерирует случайное число от 0 до 9 и выводит предположение игрока в консоль.

### GuessGame
Класс `GuessGame` управляет логикой игры:
- **Атрибуты**:
    - `p1`, `p2`, `p3`: три экземпляра класса `Player`.
- **Методы**:
    - `startGame()`: инициализирует игроков и запускает игру.
    - Генерируется случайное число от 0 до 9, и каждый игрок делает своё предположение.
    - Игра продолжается до тех пор, пока хотя бы один игрок не угадает число.
    - Выводится информация о победителе или сообщение о продолжении игры.

### GameLauncher
Класс `GameLauncher` является точкой входа в приложение:
- Содержит метод `main()`, который создаёт экземпляр `GuessGame` и вызывает метод `startGame()` для запуска игры.

## Назначение пакета
Пакет `GuessGame` предназначен для демонстрации:
- Создания классов и взаимодействия между ними.
- Инициализации объектов и вызова методов.
- Практики работы с циклами, случайными числами и условными операторами.

## Применение
- Основы ООП на языке Java.
- Создание и использование классов, атрибутов и методов.
- Разработка простых консольных приложений.