package com.company;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Kütüphaneler
        Scanner input= new Scanner(System.in);
        //Değişkenler
        int a,b,c;
        int cevre,rcevre;
        //Girdiler
        System.out.println("1.Kenarı giriniz: ");
        a=input.nextInt();
        System.out.println("2.Kenarı giriniz: ");
        b=input.nextInt();
        System.out.println("3.Kenarı giriniz: ");
        c=input.nextInt();
        cevre= (a+b+c)/2;
        System.out.println(cevre);
        double alan= Math.sqrt(cevre*( cevre-a) * (cevre-b) * (cevre-c));
        System.out.println("Alan: "+ alan);
    }
}