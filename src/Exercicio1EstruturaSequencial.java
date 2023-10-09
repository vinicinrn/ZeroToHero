import java.util.Scanner;

public class Exercicio1EstruturaSequencial {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira valor de A: ");
        int a = sc.nextInt();
        System.out.println("Insira o valor de B");
        int b = sc.nextInt();
        int total = a + b;
        System.out.println("A soma de A+B é: " + total);
        sc.close();
    }
}