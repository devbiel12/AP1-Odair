package Exercicios;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um grau em Celsius: ");
        double celsius = sc.nextInt();
        sc.close();

        double fahrenheit = celsius * 1.8 + 32;

        System.out.println("A temperatura de "+celsius+"ºC em Fahrenheit é "+ fahrenheit+"°F");

    }
}
