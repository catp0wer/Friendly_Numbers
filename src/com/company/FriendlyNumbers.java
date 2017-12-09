package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendlyNumbers {

    public void sendNumbers(int n){

        for(int i=n; i>0;i--){
            for(int j=0;j<=n;j++){
                if(isFriendly(i,j)){
                    System.out.println("i " + i +" and j " + j + " are friendly ");
                }
            }
        }
    }

    private ArrayList<Integer> findDivisors(int number) {
        ArrayList<Integer> divisors = new ArrayList<Integer>();

        for (int j = number-1; j > 0; j--) {
            if (number % j == 0) {
              //  System.out.println("x is " + number + " and divisors are " + j);
                divisors.add(j);
            }
        }
        //System.out.println(divisors);
        return divisors;
    }

    private int sumDivisors(ArrayList<Integer> divisors) {
        int sum = 0;
        for(int i : divisors){
        //for (int i = 0; i < divisors.size(); i++) {
            sum += i;
        }
       // System.out.println(sum);
        return sum;
    }


    public boolean isFriendly(int x, int y){
        if(x == y){
            return false;
        }
        ArrayList<Integer> divisorsX = findDivisors(x);
        ArrayList<Integer> divisorsY = findDivisors(y);
        int sumX = sumDivisors(divisorsX);
        int sumY = sumDivisors(divisorsY);

        return sumX == y && sumY==x;

    }




}