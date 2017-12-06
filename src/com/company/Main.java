package com.company;

public class Main {

    public static void main(String[] args) {
        FriendlyNumbers my_numbers = new FriendlyNumbers();
        boolean result = my_numbers.isFriendly(220,284);
       if(result){
           System.out.println("These numbers are friendly");
       }else{
           System.out.println("These numbers are not friendly" );
       }
    }
}