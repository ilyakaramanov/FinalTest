package ua.org.oa.ilyakaramanov;

public class Math {

    public int maxNumber(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) ;
            max = array[i];
        }
        return max;
    }


    public double averageInt(double[] array) {
        double average = 0;
        double sum = 0;

        for (double temp : array) {
            sum = sum + temp;
        }
        average = sum / array.length;
        return average;
    }

    public String[] upperCase(String[] upper) {

        String[] temp = new String[upper.length];
        for (int i = 0; i < upper.length; i++) {
            temp[i] = upper[i].toUpperCase();
        }
        return temp;
    }

    public int evenNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }



    public String subSequence(String[] array){

                StringUtils.ge
String temp;

    }

    public int loop(int n) {
        int temp = 0;
        for (int i = 1; i <= 10; i++) {
            temp = n * i;
            System.out.println(n + " x " + i + " = " + temp);
        }
        return temp;
    }


}



