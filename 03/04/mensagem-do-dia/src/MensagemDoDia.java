public class MensagemDoDia {
    public static void main(String[] args) {
        int numero = 1;

        // >, <, >=, <=, ==, !=
        if (numero >= 1 && numero <= 5) {
            System.out.println("Quem avisa amigo é");
        } else if (numero >= 6 && numero <= 10) {
            System.out.println("Você é o que você come");
        } else {
            System.out.println("Informe uma opção válida!");
        }
    }
}
