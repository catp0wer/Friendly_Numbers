package com.company;

import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FriendlyNumbers my_numbers = new FriendlyNumbers();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit ");
        int n = scanner.nextInt();
        Map friendlyPairs = my_numbers.findFriendlyPairsUpTo(n);
        System.out.println(friendlyPairs);

    }
}