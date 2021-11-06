package az.coders.javalessons.lesson_5;

import java.util.Scanner;

public class MetodExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        first Ex
//        System.out.print("Enter number: ");
//        int num = sc.nextInt();
//        System.out.println(findMiddleCharacter(num));


//        System.out.print("Enter string:");
//        String str = sc.nextLine();
//
//        int vowelcount = findVowelsCount(str);
//
//        System.out.printf("Number of Vowels in the string: %s",vowelcount);

        findPentagonalNumbers();
    }

    public static int findMiddleCharacter(int num){
        String str = Integer.toString(num);
        int mid = str.length()/2;
        return Integer.parseInt(String.valueOf(str.charAt(mid)));
    }

    public static  int findVowelsCount(String str){
        int count = 0;

        String[] vowel= {
                 "a","ı","ə","ö","ü","o","u","e","i"
        };
        for (int i = 0; i < str.length(); i++) {
            for(String a : vowel){
                if(String.valueOf(str.charAt(i)).contains(a)){
                    count++;
                }
            }
        }


        return count;
    }

    public static void findPentagonalNumbers(){
        int count = 0;
        for (int i = 1; i <= 50; i++) {
            int p = (int) (3 * Math.pow(i,2) - i)/2;
            System.out.print(p + " ");
            count++;
            if(count == 10 || count == 20 || count == 30 || count == 40){
                System.out.println();
            }
        }
    }
}
// 4 7 10 13 16 19
