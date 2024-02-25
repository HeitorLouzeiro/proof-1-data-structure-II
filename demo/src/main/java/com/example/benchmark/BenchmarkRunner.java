package com.example.Benchmark;

public class BenchmarkRunner {
        public static void main(String[] args) throws Exception {
                org.openjdk.jmh.Main.main(args);

                /*
                 * -i 1: Quantas vezes será executado o teste.
                 * -wi 2: Quantas vezes será executado antes de começar a medir o tempo.
                 * -f 1: Quantas vezes será executado o teste.
                 */
/* 
                int quantidadeTestes = 1;
                int quantidadeWarmup = 2;
                int quantidadeMedicao = 1;

                org.openjdk.jmh.Main.main(new String[] {
                                "-i", Integer.toString(quantidadeTestes),
                                "-wi", Integer.toString(quantidadeWarmup),
                                "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkBubbleSortOrdenados.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                                "-i", Integer.toString(quantidadeTestes),
                                "-wi", Integer.toString(quantidadeWarmup),
                                "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkBubbleSortInvertido.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                                "-i", Integer.toString(quantidadeTestes),
                                "-wi", Integer.toString(quantidadeWarmup),
                                "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkBubbleSortAleatorio.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                                "-i", Integer.toString(quantidadeTestes),
                                "-wi", Integer.toString(quantidadeWarmup),
                                "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkBubbleSortOrdenadosV1.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                                "-i", Integer.toString(quantidadeTestes),
                                "-wi", Integer.toString(quantidadeWarmup),
                                "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkBubbleSortInvertidoV1.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                                "-i", Integer.toString(quantidadeTestes),
                                "-wi", Integer.toString(quantidadeWarmup),
                                "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkBubbleSortAleatorioV1.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                                "-i", "1",
                                "-wi", "2",
                                "-f", "1",
                                ".*BenchmarkBubbleSortOrdenadosV2.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                                "-i", "1",
                                "-wi", "2",
                                "-f", "1",
                                ".*BenchmarkBubbleSortInvertidoV2.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                                "-i", "1",
                                "-wi", "2",
                                "-f", "1",
                                ".*BenchmarkBubbleSortAleatorioV2.*"
                });
 */
        }
}