package br.com.felipe;

public class ExemploOperadores {
    public static void main(String[] args) {
        // Operadores aritméticos
        int a = 10;
        int b = 5;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        // Operadores de comparação
        boolean maior = a > b;
        boolean menor = a < b;
        boolean igual = a == b;
        boolean diferente = a != b;
        boolean maiorOuIgual = a >= b;
        boolean menorOuIgual = a <= b;

        // Operadores lógicos
        boolean and = (a > 0) && (b > 0);
        boolean or = (a > 0) || (b > 0);
        boolean not = !(a > 0);

        // Operadores de atribuição
        int c = 20;
        c += 5; // c = c + 5;
        c -= 3; // c = c - 3;
        c *= 2; // c = c * 2;
        c /= 4; // c = c / 4;
        c %= 3; // c = c % 3;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Resto: " + resto);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Igual: " + igual);
        System.out.println("Diferente: " + diferente);
        System.out.println("Maior ou igual: " + maiorOuIgual);
        System.out.println("Menor ou igual: " + menorOuIgual);
        System.out.println("And: " + and);
        System.out.println("Or: " + or);
        System.out.println("Not: " + not);
        System.out.println("Valor de c: " + c);
    }
}
