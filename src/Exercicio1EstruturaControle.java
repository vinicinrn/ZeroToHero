import java.util.Scanner;

public class Exercicio1EstruturaControle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PAR OU ÍMPAR!?");
        System.out.println("Insira um número:");
        int n = sc.nextInt();

        if (n%2 == 0){
            System.out.println("Número que você digitou é PAR!");
        } else {
            System.out.println("Número que você digitou é ÍMPAR!");
        }
    }
}
