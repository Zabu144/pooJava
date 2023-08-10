package org.example.atv1;

import java.util.Scanner;

public class ex004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println(n1 + " É maior que " + n2);
        } else if (n1 < n2) {
            System.out.println(n2 + " É maior que " + n1);
        } else {
            System.out.println(n1 + " e " + n2 + " são iguais");
        }
    }
}
