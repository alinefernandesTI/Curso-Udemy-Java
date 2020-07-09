
package exerciciohora;
import java.util.Scanner;

public class ExercicioHora {
   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x;

        do {
            System.out.println("Digite a hora com numero inteiro ");
            x = ler.nextInt();
            if (x <= 0) {
                System.out.println("Hora informada Incorreta");
            }
        } while (x <= 0);

        if (x < 12) {
            System.out.println("Bom dia!");
        } else {
            if (x >= 12 && x < 18) {
                System.out.println("Bom tarde!");
            } else {
                System.out.println("Bom noite!");
            }
        }
        ler.close();
    }
}
