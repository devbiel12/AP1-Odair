import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de 'a' da formula de 2º grau: ");
        double valorA = sc.nextFloat();

        System.out.println("Digite o valor de 'b' da formula de 2ºgrau: ");
        double valorB = sc.nextFloat();

        System.out.println("Digite o valor de 'c' da formula de 2ºgrau: ");
        double valorC = sc.nextFloat();
        sc.close();

        double delta = (valorB*valorB) - 4*valorA*valorC;
        double xPositivo = (-valorB + java.lang.Math.sqrt(delta))/ (2 * valorA);
        double xNegativo = (-valorB - java.lang.Math.sqrt(delta))/ (2 * valorA);


        System.out.println("O valor de delta é: " + delta + " e os valores de X da equação de segundo grau são: "+xPositivo+" e "+xNegativo);
    }
}