/*fazer um programa para ler um valor inteiro de 1 a 7 representando um dia da semana (sendo 1= domingo, 2= segunda e assim por diante)
escrever na tela do dia da semana correspondente*/
package exercicio6;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia = 0;
        String diaSemana;

        do {
            System.out.println("Informe um numero inteiro de 1 a 7: ");
            dia = ler.nextInt();

            switch (dia) {
                case 1:
                    diaSemana = "Domingo";
                    break;
                case 2:
                    diaSemana = "Segunda-feira";
                    break;
                case 3:
                    diaSemana = "Terça-feira";
                    break;
                case 4:
                    diaSemana = "Quarta-feira";
                    break;
                case 5:
                    diaSemana = "Quinta-feira";
                    break;
                case 6:
                    diaSemana = "Sexta-feira";
                    break;
                case 7:
                    diaSemana = "Sábado";
                    break;
                default:
                    diaSemana = "Valor inválido";
                    break;
            }
            System.out.println(diaSemana);
        } while (dia < 1 || dia > 7);

    }
}
