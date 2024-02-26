package com.example.Benchmark;

import org.openjdk.jmh.Main;

public class BenchmarkRunner {
        public static void main(String[] args) throws Exception {
                // org.openjdk.jmh.Main.main(args);

                /*
                 * -i 1: Quantas vezes será executado o teste.
                 * -wi 2: Quantas vezes será executado antes de começar a medir o tempo.
                 * -f 1: Quantas vezes será executado o teste.
                 */

                int quantidadeTestes = 1;
                int quantidadeWarmup = 2;
                int quantidadeMedicao = 1;

                String[] benchmarkClasses = {
                                ".*BenchmarkBubbleSortOrdenados.bubbleSort.*",
                                ".*BenchmarkBubbleSortInvertido.bubbleSort.*",
                                ".*BenchmarkBubbleSortAleatorio.bubbleSort.*",

                                // Adicione outras classes de benchmark aqui...
                };
                for (String benchmarkClass : benchmarkClasses) {
                        Main.main(new String[] {
                                        "-i", Integer.toString(quantidadeTestes),
                                        "-wi", Integer.toString(quantidadeWarmup),
                                        "-f", Integer.toString(quantidadeMedicao),
                                        benchmarkClass
                        });
                }
        }
}