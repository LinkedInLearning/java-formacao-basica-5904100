import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        base = scanner.nextInt();
        int altura = scanner.nextInt();

        int area = base * altura / 2;
        System.out.println(area);
    }
}
