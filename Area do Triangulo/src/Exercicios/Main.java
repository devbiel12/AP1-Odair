package Exercicios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base: ");
        float base = sc.nextFloat();

        System.out.println("Digite seu altura: ");
        float altura = sc.nextFloat();
        sc.close();

        float area = base * altura/2;
        System.out.println("A area do triangulo é: " + area);
    }
}