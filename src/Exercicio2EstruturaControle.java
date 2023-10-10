import java.util.Scanner;

public class Exercicio2EstruturaControle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Identificador de positivo ou negativo");
        System.out.println("Insira um número");
        int n = sc.nextInt();

        if (n>0){
            System.out.println("O número é positivo");
        } else {
            System.out.println("O número é negativo");
        }
        sc.close();
    }
}
