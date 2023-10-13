import java.util.Scanner;

public class Exercicio2EstruturaRepetitiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira uma coordenada X:");
        int x = sc.nextInt();
        System.out.println("Insira uma coordenada y:");
        int y = sc.nextInt();

        while(x!=0 && y!=0){
            if(x>0 && y>0){
                System.out.println("Pimeiro quadrante!");
            } else if (x<0 && y>0){
                System.out.println("Segundo quadrante!");
            } else if (x<0 && y<0) {
                System.out.println("Terceiro quadrante");
            } else{
                System.out.println("Quarto quadrante");
            }
            x = sc.nextInt(); //continuar pegando valores quando while estabelecido
            y = sc.nextInt(); //continuar pegando valores quando while estabelecido
        }
        System.out.println("Quadrante não estabelecido. Fora de regra.");

        sc.close();
    }

}
