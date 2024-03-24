public class EstudanteApp {
    public static void main(String[] args) {
        int idade = 18;
        char inicialDoNome = 'G';
        char inicialDoSobrenome = 'B';
        double media = 10.0;
        boolean aprovado = true;
        String nome = "Giuliana";
        String sobrenome = "Bezerra";

        System.out.println(
            idade + ", "
            + inicialDoNome + ", "
            + inicialDoSobrenome + ", "
            + media + ", "
            + aprovado + ", "
            + nome + ", "
            + sobrenome
        );
        System.out.println(inicialDoNome);
        System.out.println(inicialDoSobrenome);
        System.out.println(media);
        System.out.println(aprovado);
        System.out.println(nome + " " + sobrenome);
        System.out.println(inicialDoNome + " " + inicialDoSobrenome);
    }
}
