package org.example;

import java.util.Scanner;

public class ex001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Lê vários tipos de dados

        int anoAtual = 2023;
        int anoNascimento;

        System.out.print("Digite o seu ano de nascimento: ");
        anoNascimento = sc.nextInt(); //Serve para fazer os inputs

        int idade = anoAtual - anoNascimento;

        System.out.println("A idade do indivídio é: " + idade + " anos!");
    }


}