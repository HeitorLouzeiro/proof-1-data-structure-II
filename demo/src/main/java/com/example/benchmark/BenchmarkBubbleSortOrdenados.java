package com.example.benchmark;

import com.example.LerArquivo;
import com.example.AlgoritimosOrdenacao.BubbleSort;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Warmup;

public class BenchmarkBubbleSortOrdenados {
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1) // Quantas vezes será executado o teste.
    @Warmup(iterations = 2) //Quantas vezes será executado antes de começar a medir o tempo.
    @Measurement(iterations = 1)// Quantas vezes será executado o teste.
    /* 
     * Método para executar o BubbleSort com números ordenados
     * Será executado pelo JMH
     * Com 2 warmups que é as iterações de aquecimento
     * Com 1 medição
     */
    public void bubbleSort() {
        LerArquivo lerArquivo = new LerArquivo();
        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenados.txt");
        BubbleSort.bubbleSort(numeros);
    }
    
}
