package Exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu peso: ");
        float peso = sc.nextFloat();

        System.out.println("Digite seu altura: ");
        float altura = sc.nextFloat();
        sc.close();

        float imc = peso / (altura*altura);
        System.out.println("O seu IMC atualmente é: " + imc);
    }
}
