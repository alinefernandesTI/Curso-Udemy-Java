package exercicio8;
import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double valor = 34.5;
        double desconto = (valor < 20) ? valor * 0.1 : valor * 0.5;
        double preco;

        System.out.println(desconto);
        
        System.out.println("inofome o valor do preço: ");
        preco= ler.nextDouble();
        double desconto2 = (valor < 15) ? preco * 0.1 : preco *0.5;
        System.out.println(desconto2);
       
        
        
    }

}
