package com.example.AlgoritimosOrdenacao;

import com.example.LerArquivo;

public class SelectSort {
    public static void selectSort(int[] numeros) {
        int tamanhoVetor = numeros.length;
        int trocas = 0;
        int comparacoes = 0;

        int i, j, numeroSelecionado, menorNumero, posicaoMenorNumero;

        for (i = 0; i < tamanhoVetor - 1; i++) {
            numeroSelecionado = numeros[i];
            menorNumero = numeros[i + 1];
            posicaoMenorNumero = i + 1;
            
            for (j = i + 1; j < tamanhoVetor; j++) {
                comparacoes++;
                if (numeros[j] < menorNumero) {
                    menorNumero = numeros[j];
                    posicaoMenorNumero = j;
                }
            }
            
            if (menorNumero < numeroSelecionado) {
                numeros[i] = numeros[posicaoMenorNumero];
                numeros[posicaoMenorNumero] = numeroSelecionado;
                trocas++;
            }
        }

        System.out.println("\nNúmeros ordenados com sucesso!");
        System.out.println("\nQuantidade de comparações: " + comparacoes);
        System.out.println("\nQuantidade de Trocas: " + trocas);

    }

    public static void main(String[] args) {
        LerArquivo lerArquivo = new LerArquivo();

        System.out.println("############# Select Sort ###################");

        System.out.println("---------------------Lendo arquivos com números ordenados---------------------");

        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenados.txt");
        selectSort(numeros);

        System.out
                .println("\n---------------------Lendo arquivos com números ordenados invertidos---------------------");

        int[] numerosInvertidos = lerArquivo.lerArquivo("data/numerosOrdenadosInvertidos.txt");
        selectSort(numerosInvertidos);

        System.out.println("\n---------------------Lendo arquivos com números aleatórios---------------------");

        int[] numerosAleatorios = lerArquivo.lerArquivo("data/numerosAleatorios.txt");
        selectSort(numerosAleatorios);
    }
}
