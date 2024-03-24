import java.util.Scanner;

public class MensagemDoDia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 10:");
        int numero = scanner.nextInt();

        // >, <, >=, <=, ==, !=
        if (numero >= 1 && numero <= 5) {
            String mensagem = "Quem avisa amigo é";
            System.out.println(mensagem);
        } else if (numero >= 6 && numero <= 10) {
            String mensagem = "Você é o que você come";
            System.out.println(mensagem);
        } else {
            String mensagem = "Informe uma opção válida!";
            System.out.println(mensagem);
        }
    }
}
