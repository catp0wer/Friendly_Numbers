package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FriendlyNumbers my_numbers = new FriendlyNumbers();

        ///codul adaugat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit ");
        int n = scanner.nextInt();
        my_numbers.sendNumbers(n);


       boolean result = my_numbers.isFriendly(28,28);



       if(result){
           System.out.println("These numbers are friendly");
       }else{
           System.out.println("These numbers are not friendly" );
       }
    }
}