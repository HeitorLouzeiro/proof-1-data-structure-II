package com.example.AlgoritimosOrdenacao;

import com.example.LerArquivo;

public class BubbleSortV2 {
    public static void bubbleSortV2(int[] numeros) {
        int tamanhoVetor = numeros.length;
        boolean trocas = true;
        long numeroTrocas = 0;
        long comparacoes = 0;

        int numero = 1;
        while (numero <= tamanhoVetor && trocas == true) {
            trocas = false;
            for (int i = 0; i < tamanhoVetor - 1; i++) {
                comparacoes++;
                if (numeros[i] > numeros[i + 1]) { // Modificação: troca ocorre quando o número atual for maior do que o próximo número
                    trocas = true;
                    int temp = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = temp;
                    numeroTrocas++;
                }
            }
            numero++;
        }

        System.out.println("\nNúmeros ordenados com sucesso!");
        System.out.println("\nQuantidade de comparações: " + comparacoes);
        System.out.println("\nQuantidade de Trocas: " + numeroTrocas);
    }

    public static void main(String[] args) {
        LerArquivo lerArquivo = new LerArquivo();

        System.out.println("############# Bubble Sort V2 ###################");

        System.out.println("---------------------Lendo arquivos com números ordenados---------------------");

        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenados.txt");
        bubbleSortV2(numeros);

        System.out.println("\n---------------------Lendo arquivos com números ordenados invertidos---------------------");

        int[] numerosInvertidos = lerArquivo.lerArquivo("data/numerosOrdenadosInvertidos.txt");
        bubbleSortV2(numerosInvertidos);

        System.out.println("\n---------------------Lendo arquivos com números aleatórios---------------------");

        int[] numerosAleatorios = lerArquivo.lerArquivo("data/numerosAleatorios.txt");
        bubbleSortV2(numerosAleatorios);
    }
}