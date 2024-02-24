package com.example.AlgoritimosOrdenacao;

import com.example.LerArquivo;

public class BubbleSort {
    public static void bubbleSort(int[] numeros) {
        long tempoInicial = System.currentTimeMillis();
        long tempoFinal = 0;

        int tamanhoVetor = numeros.length;
        int trocas = 0;
        int comparacoes = 0;

        for (int i = 1; i <= tamanhoVetor; i++) {
            for (int j = 0; j < tamanhoVetor - 1; j++) {
                comparacoes++;
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                    trocas++;
                }
            }
        }

        System.out.println("\nNúmeros ordenados com sucesso!");
        System.out.println("\nQuantidade de comparações: " + comparacoes);
        System.out.println("\nQuantidade de Trocas: " + trocas);

        tempoFinal = System.currentTimeMillis();
        System.out.println("\nTempo de execução: " + (tempoFinal - tempoInicial) + " ms");
    }

    public static void main(String[] args) {
        LerArquivo lerArquivo = new LerArquivo();

        System.out.println("############# Bubble Sort ###################");

        System.out.println("---------------------Lendo arquivos com números ordenados---------------------");

        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenados.txt");
        bubbleSort(numeros);

        System.out
                .println("\n---------------------Lendo arquivos com números ordenados invertidos---------------------");

        int[] numerosInvertidos = lerArquivo.lerArquivo("data/numerosOrdenadosInvertidos.txt");
        bubbleSort(numerosInvertidos);

        System.out.println("\n---------------------Lendo arquivos com números aleatórios---------------------");

        int[] numerosAleatorios = lerArquivo.lerArquivo("data/numerosAleatorios.txt");
        bubbleSort(numerosAleatorios);
    }
}