package com.company;
import java.util.ArrayList;

public class FriendlyN {

    public ArrayList findDivisorX(int x) {
        ArrayList<Integer> divisorsX = new ArrayList<Integer>();
        int sumY = 0;
        for (int j = x - 1; j > 0; j--) {
            if (x % j == 0) {
                System.out.println("x is " + x + " and divisors are " + j);
                divisorsX.add(j);
            }
        }
        System.out.println(divisorsX);
        return divisorsX;
    }


}