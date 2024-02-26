package com.example.AlgoritimosOrdenacao;

import com.example.LerArquivo;

public class HeapSort {
    private static int comparacoes = 0;
    private static int trocas = 0;

    public static void resetContadores() {
        comparacoes = 0;
        trocas = 0;
    }

    public static void transformaHeap(int[] array, int quantidade) {
        for (int i = quantidade / 2 - 1; i >= 0; i--) {
            heapFica(array, i, quantidade);
        }
    }

    public static void heapFica(int[] array, int i, int quantidade) {

        int filhoEsquerdo, filhoDireito, raiz, auxiliar;

        raiz = i;
        filhoEsquerdo = 2 * i + 1;
        filhoDireito = 2 * i + 2;

        if (filhoEsquerdo < quantidade && array[filhoEsquerdo] > array[raiz]) {
            raiz = filhoEsquerdo;

        }

        if (filhoDireito < quantidade && array[filhoDireito] > array[raiz]) {
            raiz = filhoDireito;
            
        }
        
        
        if (raiz != i) {
            auxiliar = array[i];
            array[i] = array[raiz];
            array[raiz] = auxiliar;
            heapFica(array, raiz, quantidade);
          
        }
        comparacoes++;
    }

    public static void ordena(int[] array, int quantidade) {
        int i, auxiliar;
        for (i = quantidade - 1; i > 0; i--) {

            auxiliar = array[0];
            array[0] = array[i];
            array[i] = auxiliar;
            
            heapFica(array, 0, i);
            
            trocas++;
        }
    }

    public static void main(String[] args) {
        LerArquivo lerArquivo = new LerArquivo();

        System.out.println("############# Merge Sort ###################");

        System.out.println("---------------------Lendo arquivos com números ordenados---------------------");

        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenados.txt");

        int tamanhoVetor = numeros.length;
        resetContadores();

        transformaHeap(numeros, tamanhoVetor);

        ordena(numeros, tamanhoVetor);

        System.out.println("Quantidade de comparações: " + comparacoes);
        System.out.println("Quantidade de trocas: " + trocas);

        System.out.println("---------------------Lendo arquivos com números em ordem Inversa---------------------");

        int[] numerosInversos = lerArquivo.lerArquivo("data/numerosOrdenadosInvertidos.txt");

        tamanhoVetor = numerosInversos.length;
        resetContadores();

        transformaHeap(numerosInversos, tamanhoVetor);

        ordena(numerosInversos, tamanhoVetor);

        System.out.println("Quantidade de comparações: " + comparacoes);
        System.out.println("Quantidade de trocas: " + trocas);

        System.out.println("---------------------Lendo arquivos com números Aleatorios---------------------");

        int[] numerosAleatorios = lerArquivo.lerArquivo("data/numerosAleatorios.txt");

        tamanhoVetor = numerosAleatorios.length;
        resetContadores();

        transformaHeap(numerosAleatorios, tamanhoVetor);

        ordena(numerosAleatorios, tamanhoVetor);

        System.out.println("Quantidade de comparações: " + comparacoes);
        System.out.println("Quantidade de trocas: " + trocas);

    }

}
