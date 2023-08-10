package org.example.atv1;

import java.util.Scanner;

public class ex003 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        float p1;
        float p2;
        float p3;

        System.out.print("Digite a altura da Pessoa 1: ");
        p1 = sc.nextFloat();

        System.out.print("Digite a altura da Pessoa 2: ");
        p2 = sc.nextFloat();

        System.out.print("Digite a altura da Pessoa 3: ");
        p3 = sc.nextFloat();

        float media = (p1 + p2 + p3) / 3;

        System.out.println("A média total das alturas é: " + media);
        
    }
}
