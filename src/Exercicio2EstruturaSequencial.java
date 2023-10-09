
import java.util.Scanner;

public class Exercicio2EstruturaSequencial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculando a area da circunferencia");
        System.out.print("Insira o raio da circunferência: ");
        double raio = sc.nextDouble();
        double area = Math.PI * raio * raio;

        System.out.printf("Area= %.4f", area);

        sc.close();
    }
}
