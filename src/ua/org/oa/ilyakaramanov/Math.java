package ua.org.oa.ilyakaramanov;

/*
Класс создан для решения заданий 1-6
 */

public class Math {

    /*
    Метод находит наибольшее число в массиве
     */

    public int maxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) ;
            max = array[i];
        }
        return max;
    }

    /*
    Метод возвращает среднее арифметическое значение всех элеметнов массива
     */

    public double averageInt(double[] array) {
        double average = 0;
        double sum = 0;

        for (double temp : array) {
            sum = sum + temp;
        }
        average = sum / array.length;
        return average;
    }

    /*
    Метод делает все буквы заглавными
     */

    public String[] upperCase(String[] upper) {

        String[] temp = new String[upper.length];
        for (int i = 0; i < upper.length; i++) {
            temp[i] = upper[i].toUpperCase();
        }
        return temp;
    }

    /*
    Метод суммирует все четные числа массива
     */

    public int evenNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }

    /*
    Метод находит максимальную последовательность символов в двух предложениях
     */

    public String subSequence(String s1, String s2) {
        int s1Len = s1.length();
        int s2Len = s2.length();
        if (s1Len == 0 || s2Len == 0) {
            return "";
        } else if (s1.charAt(s1Len - 1) == s2.charAt(s2Len - 1)) {
            return subSequence(s1.substring(0, s1Len - 1), s2.substring(0, s2Len - 1)) + s1.charAt(s1Len - 1);
        } else {
            String x = subSequence(s1, s2.substring(0, s2Len - 1));
            String y = subSequence(s1.substring(0, s1Len - 1), s2);
            {
                if (x.length() > y.length()) {
                    return x;
                } else return y;
            }
        }
    }

    /*
    Метод выводит аналог таблицы унможения
     */

    public int loop(int n) {
        int temp = 0;
        for (int i = 1; i <= 10; i++) {
            temp = n * i;
            System.out.println(n + " x " + i + " = " + temp);
        }
        return temp;
    }

}



