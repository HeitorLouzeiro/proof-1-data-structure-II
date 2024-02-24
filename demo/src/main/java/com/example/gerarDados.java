package com.example;

/* 
 * Gerar dados para a aplicação de forma aleatória, para testes sem repetição de numeros
 */
import java.io.BufferedWriter; // Usa o Buffer interno para escrever no arquivo
import java.io.File;
import java.io.FileWriter; // Usa o FileWriter para escrever diretamente no arquivo
import java.io.IOException; // Tratamento de exceções como erro de escrita
import java.util.HashSet; // Usa o HashSet para garantir que não haja repetição de números
import java.util.Set; // É usado para garantir que não haja repetição de números

public class GerarDados {
    private int quantidadeNumeros;
    private int[] numeros;

    public GerarDados(int quantidadeNumeros) {
        this.quantidadeNumeros = quantidadeNumeros;
        this.numeros = new int[quantidadeNumeros];
    }

    private void gerarNumerosOrdenados() {
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = i;
        }
    }

    private void gerarNumerosOrdenadosInvertidos() {
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = quantidadeNumeros - i;
        }
    }

    private void gerarNumerosAleatorios() {
        Set<Integer> numerosGerados = new HashSet<>();
        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero;
            do {
                numero = (int) (Math.random() * quantidadeNumeros);
            } while (numerosGerados.contains(numero));
            numerosGerados.add(numero);
            numeros[i] = numero;
        }
    }

    private void escreverNumerosArquivo(String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (int i = 0; i < quantidadeNumeros; i++) {
                writer.write(Integer.toString(numeros[i]));
                writer.newLine();
            }
            System.out.println("Números escritos no arquivo '" + nomeArquivo + "' com sucesso.");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    private void CreateFolder(String folderName) {
        File dataFolder = new File(folderName);
        if (!dataFolder.exists()) {
            boolean created = dataFolder.mkdirs();
            if (!created) {
                System.out.println("Falha ao criar a pasta 'data'.");
                return;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Gerando números...");

        GerarDados gerador = new GerarDados(1000000);

        gerador.CreateFolder("data");

        gerador.gerarNumerosOrdenados();
        gerador.escreverNumerosArquivo("data/numerosOrdenados.txt");
        gerador.gerarNumerosOrdenadosInvertidos();
        gerador.escreverNumerosArquivo("data/numerosOrdenadosInvertidos.txt");
        gerador.gerarNumerosAleatorios();
        gerador.escreverNumerosArquivo("data/numerosAleatorios.txt");
    }
}