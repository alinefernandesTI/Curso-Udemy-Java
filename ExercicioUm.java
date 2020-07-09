package exercicioum;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {
        int teste, teste2;
        int calculo;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 2 valores: ");
        teste = ler.nextInt();
        teste2= ler.nextInt();
        calculo = teste + teste2;
        System.out.println("A soma dos valores é = "+calculo);

    }

}
