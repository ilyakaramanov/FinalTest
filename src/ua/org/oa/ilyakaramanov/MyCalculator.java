package ua.org.oa.ilyakaramanov;

import java.lang.Math;

public class MyCalculator {

    int n;
    int p;

    public int power(int n, int p) throws CustomException {
        if (n == 0 || p == 0) {
            throw new CustomException("n and p should not be zero");
        } else if (n < 0 || p < 0) {
            throw new CustomException("n or p should not be negative");
        } else
            return (int) Math.pow(n, p);
    }

}
