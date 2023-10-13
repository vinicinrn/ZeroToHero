import java.util.Scanner;

public class Exercicio1EstruturaRepetitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Para fins de teste, insira uma senha diferente de 2002:");
        int senha = sc.nextInt();

        while(senha!=2002){
            System.out.println("Senha invalida");
            System.out.println("Insira outra senha");
            senha = sc.nextInt();
        }
        System.out.println("Acesso Permitido");
        sc.close();
    }
}
