/*Fazer um programa que leia três valores : A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */
package exercicio7;


import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        Scanner ler = new Scanner(System.in);
        

        System.out.println("Informe três valores: ");
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();

        triangulo = a * c / 2.0;
        circulo = 3.14159 * c * c;
        trapezio = (a + b) / 2.0 * c;
        quadrado = b * b;
        retangulo = a * b;
        
        System.out.printf("Triangulo: %.3f \n", triangulo);
        System.out.printf("Circulo: %.3f \n", circulo);
        System.out.printf("Trapézio: %.3f \n", trapezio);
        System.out.printf("Quadrado: %.3f \n", quadrado);
        System.out.printf("Retangulo: %.3f \n", retangulo);
        
    }

}
