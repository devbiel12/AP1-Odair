package Exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um grau em Fahrenheit: ");
        float fahrenheit = sc.nextFloat();

        float celsius = 5 * ((fahrenheit-32)/9);

        System.out.println("A temperatura de "+fahrenheit+"ºF em Celsius é "+ celsius+"°C");
        sc.close();
    }
}
