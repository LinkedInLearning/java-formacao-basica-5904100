public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Antes do Alarme");
        alarmeHoraDoLanche();
        alarmeHoraDoLanche();
        alarmeHoraDoLanche();
        System.out.println("Depois do Alarme");
    }

    public static void alarmeHoraDoLanche() {
        System.out.println("Hora do Lanche!");
    }
}
