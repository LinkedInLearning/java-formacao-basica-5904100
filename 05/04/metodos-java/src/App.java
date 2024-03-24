public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Antes do Alarme");
        alarmeHoraDoLanche();
        alarmeHoraDoLanche();
        alarmeHoraDoLanche();
        System.out.println("Depois do Alarme");
        
        calcularMedia(7.0, 8.0, 9.0);
        calcularMedia(5.0, 6.0, 7.0);
    }

    public static void alarmeHoraDoLanche() {
        System.out.println("Hora do Lanche!");
    }

    public static void calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3.0;
        System.out.println(media);
    }
}
