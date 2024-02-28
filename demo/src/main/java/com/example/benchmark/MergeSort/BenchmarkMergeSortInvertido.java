package com.example.Benchmark.MergeSort;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.annotations.Mode;

import com.example.LerArquivo;
import com.example.AlgoritimosOrdenacao.MergeSort;

public class BenchmarkMergeSortInvertido {
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1) // Quantas vezes será executado o teste.
    @Warmup(iterations = 2) // Quantas vezes será executado antes de começar a medir o tempo.
    @Measurement(iterations = 1) // Quantas vezes será executado o teste.
    /*
     * Método para executar o MergeSort com números ordenados
     * Será executado pelo JMH
     * Com 2 warmups que é as iterações de aquecimento
     * Com 1 medição
     */
    public void MergeSort() {
        LerArquivo lerArquivo = new LerArquivo();
        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenadosInvertidos.txt");

        int tamanhoVetor = numeros.length - 1;
        MergeSort.mergeSort(numeros, 0, tamanhoVetor);
    }

}
