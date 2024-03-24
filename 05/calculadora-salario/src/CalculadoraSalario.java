/*
 * Crie um programa que calcule o salário do empregado.
 * O programa deve ler:
 *      - O número de horas trabalhadas na semana.
 *      - O preço da hora do empregado.
 */

import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora:");
        double valorHora = scanner.nextDouble();
        System.out.println("Digite o número de horas: ");
        double numeroDeHoras = scanner.nextDouble();

        double salario  = calcularSalario(valorHora, numeroDeHoras);
        System.out.println(salario);
    }

    public static double calcularSalario(double valorHora, double numeroDeHoras) {
        double salario = valorHora * numeroDeHoras;
        return salario;
    }
}
