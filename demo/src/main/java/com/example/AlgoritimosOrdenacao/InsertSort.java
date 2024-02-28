package com.example.AlgoritimosOrdenacao;

import com.example.LerArquivo;

public class InsertSort {
    public static void insertSort(int[] numeros) {
        int tamanhoVetor = numeros.length;
        long trocas = 0;
        long comparacoes = 0;

        for (int i = 1; i < tamanhoVetor; i++) {
            int temp = numeros[i];
            int j = i - 1;
            comparacoes++;
            while (j >= 0 && numeros[j] > temp) {
                numeros[j + 1] = numeros[j];
                j--;
                trocas++;
            }
            numeros[j + 1] = temp;
        }

        System.out.println("\nNúmeros ordenados com sucesso!");
        System.out.println("\nQuantidade de comparações: " + comparacoes);
        System.out.println("\nQuantidade de Trocas: " + trocas);
    }
    public static void main(String[] args) {
        LerArquivo lerArquivo = new LerArquivo();

        System.out.println("############# InsertSort Sort ###################");

        System.out.println("---------------------Lendo arquivos com números ordenados---------------------");

        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenados.txt");
        insertSort(numeros);

        System.out.println("\n---------------------Lendo arquivos com números ordenados invertidos---------------------");

        int[] numerosInvertidos = lerArquivo.lerArquivo("data/numerosOrdenadosInvertidos.txt");
        insertSort(numerosInvertidos);

        System.out.println("\n---------------------Lendo arquivos com números aleatórios---------------------");

        int[] numerosAleatorios = lerArquivo.lerArquivo("data/numerosAleatorios.txt");
        insertSort(numerosAleatorios);
    }
    
}
