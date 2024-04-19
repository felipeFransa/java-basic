package br.com.felipe;

public class ExemploManipulacaoStrings {
    public static void main(String[] args) {
        // Declaração e inicialização de uma string
        String mensagem = "Olá, mundo!";

        // Obtendo o comprimento da string
        int comprimento = mensagem.length();
        System.out.println("Comprimento da string: " + comprimento);

        // Obtendo um caractere específico da string
        char primeiroCaractere = mensagem.charAt(0);
        System.out.println("Primeiro caractere: " + primeiroCaractere);

        // Concatenando strings
        String outraMensagem = mensagem + " Bem-vindo!";
        System.out.println("Concatenação: " + outraMensagem);

        // Comparando strings
        String outraString = "Olá, mundo!";
        boolean saoIguais = mensagem.equals(outraString);
        System.out.println("As strings são iguais? " + saoIguais);

        // Convertendo para maiúsculas e minúsculas
        String emMaiusculas = mensagem.toUpperCase();
        String emMinusculas = mensagem.toLowerCase();
        System.out.println("Maiúsculas: " + emMaiusculas);
        System.out.println("Minúsculas: " + emMinusculas);

        // Substituindo caracteres
        String novaMensagem = mensagem.replace('o', 'x');
        System.out.println("Substituição de caracteres: " + novaMensagem);

        // Dividindo a string em partes
        String[] partes = mensagem.split(",");
        for (String parte : partes) {
            System.out.println("Parte: " + parte.trim());
        }

        // Verificando se a string começa ou termina com determinado prefixo/sufixo
        boolean comecaComOla = mensagem.startsWith("Olá");
        boolean terminaComMundo = mensagem.endsWith("mundo!");
        System.out.println("Começa com 'Olá'? " + comecaComOla);
        System.out.println("Termina com 'mundo!'? " + terminaComMundo);
    }
}

