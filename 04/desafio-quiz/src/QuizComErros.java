import java.util.Scanner;

public class QuizComErros {
  public static void main(String[] args) {
    String pergunta = "Qual a melhor linguagem de programação?";
    String alternativa1 = "javascript";
    String alternativa2 = "php";
    String alternativa3 = "java";
    int respostaCerta = 3;
    
    System.out.println(pergunta);
    System.out.println(alternativa1);
    System.out.println(alternativa2);
    System.out.println(alternativa3);
    System.out.println("Digite a resposta certa (1, 2 ou 3):");

    Scanner scanner = new Scanner(System.in);
    int resposta = scanner.nextInt();

    if (resposta == respostaCerta) {
      System.out.println("Parabéns, você acertou!");
    } else {
      System.out.println("Que pena, a resposta era " + respostaCerta);
    }
}
}
