package UsAlmanProgram;

import java.util.Scanner;

public class Kod {

    static void kuvvet(){

        Scanner s = new Scanner(System.in);

        int taban, us, result = 1;

        System.out.print("Taban değerini giriniz : ");
        taban = s.nextInt();

        System.out.print("Üs değerini giriniz : ");
        us = s.nextInt();

        for (int i = 1; i <= us; i++) {

            result *= taban;

        }

        System.out.println(result);

    }

    public static void main(String[] args) {

        kuvvet();

    }
}
