import java.util.Scanner;

public class Exercicio4EstruturaControle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha seu lanche");
        int codigo = sc.nextInt();
        System.out.println("Quantos desse você quer");
        int quantidade = sc.nextInt();
        double total;

        switch (codigo){
            case 1:
                total = quantidade * 4.00;
                System.out.println("Total: R$" + total);
                break;
            case 2:
                total = quantidade * 4.50;
                System.out.println("Total: R$" + total);
                break;
            case 3:
                total = quantidade * 5.00;
                System.out.println("Total: R$" + total);
                break;
            case 4:
                total = quantidade * 2.00;
                System.out.println("Total: R$" + total);
                break;
            case 5:
                total = quantidade * 1.50;
                System.out.println("R$.%2f" + total);
                break;

            default: System.out.println("Lanche nao encontrado!");
        }
        sc.close();
    }
}
