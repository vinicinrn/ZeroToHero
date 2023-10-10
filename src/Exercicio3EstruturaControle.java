import java.util.Scanner;

public class Exercicio3EstruturaControle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Identificando se os números digitados são múltiplos entre si");

        System.out.println("Insira um numero:");
        int n = sc.nextInt();
        System.out.println("Insira outro numero:");
        int n2 = sc.nextInt();

        if (n%n2==0 || n2%n==0){
            System.out.println("Sao múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
        sc.close();
    }
}
