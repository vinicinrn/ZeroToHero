import java.util.Locale;
import java.util.Scanner;

public class Exercicio6EstruturaSequencial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de A:");
        double a = sc.nextDouble();
        System.out.println("Insira o valor de B:");
        double b = sc.nextDouble();
        System.out.println("Insira o valor de C:");
        double c = sc.nextDouble();
        double areaTrianguloRetangulo = a * c / 2.0;
        double areaCirculo = Math.PI * c * c;
        double areaTrapezio = (a + b) * c / 2.0;
        double areaRetangulo = a * b;
        System.out.printf("Área triangulo retangulo: %.3f\n", areaTrianguloRetangulo);
        System.out.printf("Área do circulo: %.3f\n", areaCirculo);
        System.out.printf("Área do trapezio: %.3f\n", areaTrapezio);
        System.out.printf("Área do retangulo: %.3f\n", areaRetangulo);

        sc.close();
    }
}
