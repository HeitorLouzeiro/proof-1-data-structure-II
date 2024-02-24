package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {
    public int[] lerArquivo(String nomeArquivo) {
        int[] numeros = new int[10000];

        System.out.println("Lendo números do arquivo...");

        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            int i = 0;
            while ((linha = reader.readLine()) != null && i < 10000) {
                //System.out.println(linha);
                numeros[i] = Integer.parseInt(linha);
                i++;
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
        
        return numeros;
    }

    public static void main(String[] args) {
        System.out.println("Lendo números do arquivo...");
        LerArquivo lerArquivo = new LerArquivo();
        int[] numeros = lerArquivo.lerArquivo("data/numerosAleatorios.txt");
        
        // Exemplo: Imprime os números lidos do arquivo
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}