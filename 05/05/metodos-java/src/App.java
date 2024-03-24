public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Antes do Alarme");
        alarmeHoraDoLanche();
        alarmeHoraDoLanche();
        alarmeHoraDoLanche();
        System.out.println("Depois do Alarme");
        
        double media = calcularMedia(7.0, 8.0, 9.0);

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

    public static void alarmeHoraDoLanche() {
        System.out.println("Hora do Lanche!");
    }

    public static double calcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3.0;
        return media;
    }
}
