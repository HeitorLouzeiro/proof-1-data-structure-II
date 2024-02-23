package com.example;
/* 
 * Gerar dados para a aplicação de forma aleatória, para testes sem repetição de numeros
 */
import java.io.BufferedWriter; // Usa o Buffer interno para escrever no arquivo
import java.io.FileWriter; // Usa o FileWriter para escrever diretamente no arquivo
import java.io.IOException; // Tratamento de exceções como erro de escrita
import java.util.HashSet; // Usa o HashSet para garantir que não haja repetição de números
import java.util.Set; // É usado para garantir que não haja repetição de números

public class gerarDados {
    public static void main(String[] args) {
        System.out.println("Gerar Dados");

        int quantidadeNumeros = 1000000; // Quantidade de números a serem gerados

        int[] numeros = new int[quantidadeNumeros];

        // Gerar números aleatórios sem repetição
        Set<Integer> numerosGerados = new HashSet<>();

        // Gerar os números aleatórios sem repetição e armazenar no array
        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero;
            do {
                /* 
                Gerar um número aleatório entre 0 e 999
                math.random() gera um número entre 0 e 1000000
                */

                numero = (int) (Math.random() * quantidadeNumeros);
            } while (numerosGerados.contains(numero));
            /* 
            Contains verifica se o número já foi gerado
            Se sim, gera um novo número, se não, adiciona o número ao array
            */
            numerosGerados.add(numero);

            // Adiciona o número ao array
            numeros[i] = numero;
        }

        // Escrever os números no arquivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("data/numerosAleatorios.txt"))) {
            for (int i = 0; i < quantidadeNumeros; i++) {
                /* 
                Escreve os números no arquivo
                writer.write escreve o número no arquivo
                Integer.toString converte o número para string
                writer.newLine pula uma linha para o próximo número 
                */
                writer.write(Integer.toString(numeros[i]));
                writer.newLine();
            }
            System.out.println("Números escritos no arquivo 'numeros.txt' com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}