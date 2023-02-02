package Metotlar;

import java.util.Scanner;

public class PalindromSayilar {
    static void f(int number) {
        int tempNumber = number;
        int reverseNumber = 0;

        int lastDigit;

        while (tempNumber != 0) {
            lastDigit = tempNumber % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            tempNumber /= 10;

        }
        if(reverseNumber == number){
            System.out.println(number + " = " + reverseNumber);
            System.out.println(number + " bir palindrom sayıdır.");
        }else{
            System.out.println(number +  " != " + reverseNumber );
            System.out.println(number + " bir palindrom sayı değildir.");
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x = inp.nextInt();

        f(x);
    }
}
