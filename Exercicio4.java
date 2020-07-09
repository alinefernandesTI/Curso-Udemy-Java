/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/
package exercicio4;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero, horas;
        float valorHora,salario;

        System.out.println("Informe o numero do Funcionário: ");
        numero = ler.nextInt();
        System.out.println("Informe numero de horas trabalhadas: ");
        horas = ler.nextInt();
        System.out.println("Informe valor recebido por hora trabalhada: ");
        valorHora = ler.nextFloat();
        salario = valorHora * horas;
        System.out.println("Funcionario: " + numero + "\nSalário: " + salario);
    }

}
