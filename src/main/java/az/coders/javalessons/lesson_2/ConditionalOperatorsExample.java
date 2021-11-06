package az.coders.javalessons.lesson_2;

import java.util.Scanner;

public class ConditionalOperatorsExample {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character");
        String ch = sc.next();
        boolean check = false;
        boolean vowch = false;
        boolean conch = false;
        String[] nonch = {
          "1","2","3","4","5","6","7","8","9","0","[","]",";","'",",",".","/"
        };
        String[] vowel = {
          "a","ı","ə","ö","ü","o","u","e","i"
        };
        String[] consonant = {
          "q","w","r","t","y","p","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m"
        };
        for(int i = 0; i < nonch.length; i++){
            if(ch.contains(nonch[i])){
                check = true;
            }
        }
        for(int i = 0; i < vowel.length; i++){
            if(ch.contains(vowel[i])){
                vowch = true;
            }
        }
        for(int i = 0; i < consonant.length; i++){
            if(ch.contains(consonant[i])){
                conch = true;
            }
        }
        if(ch.length() > 1 || check){
            System.out.println("olmaz");
        }
        else if(vowch){
            System.out.println("Input letter is Vowel");
        }
        else if(conch){
            System.out.println("Input letter is Consonant");
        }

    }
}
