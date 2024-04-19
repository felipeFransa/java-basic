package br.com.felipe;

import java.util.Scanner;

public class ExemploExcecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita ao usuário para digitar um número
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            // Divide 10 pelo número digitado
            int resultado = 10 / numero;

            // Exibe o resultado da divisão
            System.out.println("O resultado da divisão de 10 por " + numero + " é: " + resultado);
        } catch (ArithmeticException e) {
            // Se ocorrer uma exceção ao dividir por zero, captura e trata a exceção
            System.out.println("Erro: divisão por zero não é permitida.");
        } catch (Exception e) {
            // Captura e trata todas as outras exceções que possam ocorrer
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            // Executa o bloco de código dentro do bloco finally, independentemente de ocorrer uma exceção ou não
            System.out.println("O programa foi encerrado.");
            scanner.close(); // Fecha o scanner
        }
    }
}

