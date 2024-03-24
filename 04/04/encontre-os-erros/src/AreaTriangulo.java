import java.util.Scanner;

// A: 2 B: 4 = 2 * 4 / 2 = 8 / 2 = 4
// A: 3 B: 5 = 3 * 5 / 2 = 15 / 2 = 7.5
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int altura = scanner.nextInt();

        double area = (base * altura) / 2.0;
        System.out.println(area);
    }
}
