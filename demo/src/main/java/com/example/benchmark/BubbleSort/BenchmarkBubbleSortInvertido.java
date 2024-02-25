package com.example.Benchmark.BubbleSort;

import com.example.LerArquivo;
import com.example.AlgoritimosOrdenacao.BubbleSort;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Warmup;

public class BenchmarkBubbleSortInvertido {
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Fork(value = 1)
    @Warmup(iterations = 2)
    @Measurement(iterations = 1)
    public void bubbleSort() {
        LerArquivo lerArquivo = new LerArquivo();
        int[] numeros = lerArquivo.lerArquivo("data/numerosOrdenadosInvertidos.txt");
        BubbleSort.bubbleSort(numeros);
    }
}