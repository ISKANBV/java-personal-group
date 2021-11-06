package az.coders.javalessons.lesson_4;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"};

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 5, copyTo, 0, 5);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
    }
}
