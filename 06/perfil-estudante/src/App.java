/*
 * Você deve criar um programa que gerencie um Perfil de Estudante.
 * 
 * Para isso, crie uma classe Estudante com os seguintes membros:
 * Atributos:
 * - nome
 * - anoParaFormatura
 * - media
 * Métodos:
 * - setAnoParaFormatura(int anoParaFormatura)
 * Construtures:
 * - Padrão
 * - Canônico
 */
public class App {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante(
            "Estudante 1", 2025, 10.0
        );
        Estudante estudante2 = new Estudante(
            "Estudante 2", 2024, 8.0
        );

        estudante1.setAnoParaFormatura(2026);
        System.out.println(estudante1.anoParaFormatura);
        System.out.println(estudante2.anoParaFormatura);
    }
}
