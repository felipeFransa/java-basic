package br.com.felipe;

public class ExemploEstruturasControle {
    public static void main(String[] args) {
        // Estrutura de controle: if-else
        int idade = 20;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Estrutura de controle: for
        System.out.println("Contagem regressiva:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Estrutura de controle: while
        int contador = 1;
        System.out.println("Contagem progressiva:");
        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // Estrutura de controle: do-while
        int numero = 1;
        System.out.println("Mostrando números pares até 10:");
        do {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            numero++;
        } while (numero <= 10);

        // Estrutura de controle: switch
        int diaSemana = 3;
        String nomeDia;
        switch (diaSemana) {
            case 1:
                nomeDia = "Domingo";
                break;
            case 2:
                nomeDia = "Segunda-feira";
                break;
            case 3:
                nomeDia = "Terça-feira";
                break;
            case 4:
                nomeDia = "Quarta-feira";
                break;
            case 5:
                nomeDia = "Quinta-feira";
                break;
            case 6:
                nomeDia = "Sexta-feira";
                break;
            case 7:
                nomeDia = "Sábado";
                break;
            default:
                nomeDia = "Dia inválido";
        }
        System.out.println("Hoje é " + nomeDia);
    }
}
