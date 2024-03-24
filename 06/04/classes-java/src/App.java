public class App {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(
            "giuliana.bezerra",
            "giuliana",
            "giuliana@test.com"
        );
        System.out.println(usuario.email);
        System.out.println(usuario.username);
        System.out.println(usuario.password);
    }
}
