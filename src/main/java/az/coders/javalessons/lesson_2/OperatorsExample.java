package az.coders.javalessons.lesson_2;

import java.util.Random;
import java.util.Scanner;

public class OperatorsExample {
    public static void main(String[] args) {
        // Technical requirements

        // define two number of integer num1 and num2
        // for ex : num1= 5; and num2 = 12;
        // The task is :
        // write a program to reverse numbers
        // result must be : num1 = 12 and num2 = 5;

        int num1 = 5;
        int num2 = 12;

        num1 += num2;
        num2 = -(num2 - num1);
        num1 -= num2;

        System.out.println(num1);
        System.out.println(num2);





    }
}
