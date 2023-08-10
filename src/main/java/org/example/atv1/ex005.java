package org.example.atv1;

import java.util.Scanner;

public class ex005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float base;
        float altura;

        System.out.print("Digite a base: ");
        base = sc.nextFloat();

        System.out.print("Digite a altura: ");
        altura = sc.nextInt();

        float area = base * altura;
        float perimetro = (2 * base) + (2 * altura);

        System.out.println("area = " + "cm");
        System.out.println("");
    }
}
