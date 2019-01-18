package com.company;

public class Main {

    public static void main(String[] args) {
	//1. Multiples of 3 or 5
        //
        //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
        // The sum of these multiples is 23.
        //
        //Use a for loop to find the sum of all the multiples of 3 or 5 below 1000.
        int number = 0;
        int sum = 0;

     for (int i = 0; i < 1000; i++){

         if ((number % 3 == 0) || (number % 5 == 0)){

             sum += number;



         }

        number++;


     }
        System.out.println(sum);

    }


}
