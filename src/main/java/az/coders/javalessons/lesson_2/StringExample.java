package az.coders.javalessons.lesson_2;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int value = rnd.nextInt(100);
        System.out.println("Enter Your name");
        String name = sc.next();
        System.out.println("Let the game begin!");
        boolean a = true;
        while (a){
            System.out.println("Enter Value:");
            int myvalue = sc.nextInt();
            if (myvalue > value){
                System.out.println("Your number is too big. Please, try again.");
            }
            else if(myvalue < value){
                System.out.println("Your number is too small. Please, try again.");
            }
            else {
                System.out.println("Congratulations," + name);
                a = false;
            }
        }

        //How we can implement minimum bound using Random
//        Random rnd = new Random();
//        int a = rnd.nextInt(20-10) + 10;
//        System.out.println(a);


    }
}
