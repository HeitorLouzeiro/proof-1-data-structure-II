package com.example.AlgoritimosOrdenacao;

import com.example.LerArquivo;

public class MergeSort {
    private static int comparacoes = 0;
    private static int trocas = 0;

    public static void resetContadores() {
        comparacoes =  0;
        trocas =  0;
    }

    public static void mergeSort(int numeros[], int inicio, int fim) {
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeSort(numeros, inicio, meio);
            mergeSort(numeros, meio + 1, fim);
            intercala(numeros, inicio, meio, fim);

        }
    }

    public static void intercala(int numeros[], int inicio, int meio, int fim) {

        int posicaoLivre, inicioVetor1, inicioVetor2, i;
        int aux[] = new int[numeros.length];
        inicioVetor1 = inicio;
        inicioVetor2 = meio + 1;
        posicaoLivre = inicio;

        while (inicioVetor1 <= meio && inicioVetor2 <= fim) {
            comparacoes++;
            if (numeros[inicioVetor1] <= numeros[inicioVetor2]) {
                aux[posicaoLivre] = numeros[inicioVetor1];
                inicioVetor1++;
            } else {
                aux[posicaoLivre] = numeros[inicioVetor2];
                inicioVetor2++;
            }
            posicaoLivre++;
        }
        for (i = inicioVetor1; i <= meio; i++) {
            aux[posicaoLivre] = numeros[i];
            posicaoLivre++;
           
        }
        for (i = inicioVetor2; i <= fim; i++) {
            aux[posicaoLivre] = numeros[i];
            posicaoLivre++;
            
        }
        for (i = inicio; i <= fim; i++) {
            numeros[i] = aux[i];
            trocas++;
        }
    }


    public static void main(String[] args) {

        LerArquivo lerArquivo = new LerArquivo();

        System.out.println("############# Merge Sort ###################");

        System.out.println("---------------------Lendo arquivos com números ordenados---------------------");

        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenados.txt");

        int tamanhoVetor = numeros.length - 1;
        resetContadores();
        mergeSort(numeros, 0, tamanhoVetor);

        System.out.println("\nQuantidade de comparações: " + comparacoes);
        System.out.println("\nQuantidade de Trocas: " + trocas);

        System.out.println("\n---------------------Lendo arquivos com números ordenados invertidos---------------------");

        int[] numerosInvertidos = lerArquivo.lerArquivo("data/numerosOrdenadosInvertidos.txt");

        int tamanhoVetorInvertido = numerosInvertidos.length - 1;

        resetContadores();
        mergeSort(numerosInvertidos, 0, tamanhoVetorInvertido);

        System.out.println("\nQuantidade de comparações: " + comparacoes);
        System.out.println("\nQuantidade de Trocas: " + trocas);

        System.out.println("\n---------------------Lendo arquivos com números aleatórios---------------------");

        int[] numerosAleatorios = lerArquivo.lerArquivo("data/numerosAleatorios.txt");

        int tamanhoVetorAleatorio = numerosAleatorios.length - 1;

        resetContadores();
        mergeSort(numerosAleatorios, 0, tamanhoVetorAleatorio);

        System.out.println("\nQuantidade de comparações: " + comparacoes);
        System.out.println("\nQuantidade de Trocas: " + trocas);

    }

}
