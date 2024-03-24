public class App {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(
            "giuliana.bezerra",
            "giuliana",
            "giuliana@test.com"
        );
        Usuario usuario2 = new Usuario(
            "usuario2",
            "usuario2",
            "usuario2@test.com"
        );

        usuario1.ativo = true;
        System.out.println(usuario1.isAtivo());
        System.out.println(usuario2.isAtivo());
        System.out.println(Usuario.getLimiteCaracteres());
        System.out.println(Usuario.NUMERO_DE_CARACTERES);
    }
}
