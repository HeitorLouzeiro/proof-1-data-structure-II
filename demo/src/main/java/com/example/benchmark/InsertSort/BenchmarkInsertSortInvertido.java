package com.example.Benchmark.InsertSort;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.annotations.Mode;

import com.example.LerArquivo;
import com.example.AlgoritimosOrdenacao.InsertSort;

public class BenchmarkInsertSortInvertido {
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1) // Quantas vezes será executado o teste.
    @Warmup(iterations = 2) // Quantas vezes será executado antes de começar a medir o tempo.
    @Measurement(iterations = 1) // Quantas vezes será executado o teste.
    /*
     * Método para executar o InsertSort com números ordenados
     * Será executado pelo JMH
     * Com 2 warmups que é as iterações de aquecimento
     * Com 1 medição
     */
    public void InsertSort() {
        LerArquivo lerArquivo = new LerArquivo();
        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenadosInvertidos.txt");
        InsertSort.insertSort(numeros);
    }
}