package ua.org.oa.ilyakaramanov;

import java.util.Arrays;

/*
Основной класс, в котором все запускаем
 */

public class Main {


    public static void main(String[] args) throws CustomException {

        Math math = new Math();     //Объект класса Math
        /*
        Ниже вызываются методы для проверки работоспособности
         */
        System.out.print("Первое задание. Наибольшее число: ");
        System.out.println(math.maxNumber(new int[]{1, 4, 4, 7}));

        System.out.print("Второе задание. Среднее арифметическое: ");
        System.out.println(math.averageInt(new double[]{50, 1, 5, 1}));

        System.out.print("Третье задание. Заглавные: ");
        System.out.println(Arrays.asList(math.upperCase(new String[]{"aaaaaa", "bbbbbb"})));

        System.out.print("Четвертое задание. Сумма четных чисел: ");
        System.out.println(math.evenNumbers(new int[]{2, 3, 4, 5, 6}));

        System.out.print("Пятое задание. Последовательность: ");
        System.out.println(math.subSequence("test case", "test"));

        System.out.println("Шестое задание. Таблица умножения: ");
        math.loop(2);

        System.out.println("Седьмое задание. Птица умеет: ");
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

        System.out.println("Восьмое задание: ");
        MyBook book = new MyBook();     //объект класса MyBook
        book.setTitle("A tale of two cities");
        System.out.println(book.getTitle());

        System.out.println("Девятое задание. Возводим n в степень p: ");
        MyCalculator calc = new MyCalculator();
        try {
            System.out.println(calc.power(4, 2));
            System.out.println(calc.power(0, 4));
        } catch (CustomException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
