package br.com.felipe;

import java.util.Scanner;

public class ExemploEntradaSaida {
    public static void main(String[] args) {
        // Entrada de dados usando Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê uma linha de texto
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro

        // Saída de dados usando System.out
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos de idade.");

        // Fechando o Scanner
        scanner.close();
    }
}

