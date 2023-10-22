import java.util.Scanner;

public class Exercicio1For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int i;

        for (i=0; i<x; i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
