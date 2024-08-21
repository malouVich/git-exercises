package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


/*
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
 */
     for(int i = 0; i<=100; i++){
         if(i % 3 == 0 || i % 5 == 0) {
             if (i % 3 == 0) {
                 System.out.println("Fizz");
             }
             if(i % 5 ==0){
                 System.out.println("Buzz");
             }
             if(i % 3 == 0 && i % 5 == 0){
                 System.out.println("FizzBuzz");
             }
         }else System.out.println(i);
     }
    }
}