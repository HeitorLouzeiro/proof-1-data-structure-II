package com.example.AlgoritimosOrdenacao;

import com.example.LerArquivo;

public class BubbleSortV1 {
    public static void bubbleSortV1(int[] numeros) {
        int tamanhoVetor = numeros.length;
        long trocas = 0;
        long comparacoes = 0;

        int j, i, temp;
        for (j = 1; j <= tamanhoVetor - 1; j++) {
            for (i = tamanhoVetor - 1; i >= j; i--) {
                comparacoes++;
                if (numeros[i] < numeros[i - 1]) {
                    temp = numeros[i];
                    numeros[i] = numeros[i - 1];
                    numeros[i - 1] = temp;
                    trocas++;
                }
            }
        }

        System.out.println("\nNúmeros ordenados com sucesso!");
        System.out.println("\nQuantidade de comparações: " + comparacoes);
        System.out.println("\nQuantidade de Trocas: " + trocas);
    }

    public static void main(String[] args) {
        LerArquivo lerArquivo = new LerArquivo();

        System.out.println("############# Bubble Sort V1 ###################");

        System.out.println("---------------------Lendo arquivos com números ordenados---------------------");

        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenados.txt");
        bubbleSortV1(numeros);

        System.out
                .println("\n---------------------Lendo arquivos com números ordenados invertidos---------------------");

        int[] numerosInvertidos = lerArquivo.lerArquivo("data/numerosOrdenadosInvertidos.txt");
        bubbleSortV1(numerosInvertidos);

        System.out.println("\n---------------------Lendo arquivos com números aleatórios---------------------");

        int[] numerosAleatorios = lerArquivo.lerArquivo("data/numerosAleatorios.txt");
        bubbleSortV1(numerosAleatorios);
    }

}
