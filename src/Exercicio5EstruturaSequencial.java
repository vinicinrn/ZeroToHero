import java.util.Locale;
import java.util.Scanner;

public class Exercicio5EstruturaSequencial {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Codigo da peça: ");
        int p1 = sc.nextInt();
        System.out.println("Número de peças");
        int numeroP1 = sc.nextInt();
        System.out.println("Valor da peça por unidade:");
        double p1Preco = sc.nextDouble();

        System.out.println("Codigo da peça 2: ");
        int p2 = sc.nextInt();
        System.out.println("Número de peças: ");
        int numeroP2 = sc.nextInt();
        System.out.println("Valor da peça 2");
        double p2Preco = sc.nextDouble();

        double total = (double)numeroP1 * p1Preco + (double)numeroP2 * p2Preco;
        System.out.printf("Valor total é: %.2f", total);
        sc.close();
    }
}
