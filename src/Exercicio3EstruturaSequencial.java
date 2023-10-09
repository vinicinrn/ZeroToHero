import java.util.Scanner;

public class Exercicio3EstruturaSequencial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de A: ");
        double a = sc.nextDouble();
        System.out.println("Insira o valor de B: ");
        double b = sc.nextDouble();
        System.out.println("Insira o valor de C: ");
        double c = sc.nextDouble();
        System.out.println("Insira o valor de D: ");
        double d = sc.nextDouble();
        double diferenca = a * b - c * d;
        System.out.printf("A diferença é:" + diferenca);
        sc.close();
    }
}

