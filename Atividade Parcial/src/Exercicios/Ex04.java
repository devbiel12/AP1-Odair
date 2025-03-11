package Exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float numero = sc.nextFloat();
        sc.close();

        float quadrado = numero * numero;
        float cubo = numero * numero * numero;

        System.out.println("O " + numero + " ao quadrado é: " + quadrado + " e o cubo desse numero é: " + cubo);
    }
}
