package com.example.Benchmark;

public class BenchmarkRunner {
        public static void main(String[] args) throws Exception {
                //org.openjdk.jmh.Main.main(args);

                /*
                 * -i 1: Quantas vezes será executado o teste.
                 * -wi 2: Quantas vezes será executado antes de começar a medir o tempo.
                 * -f 1: Quantas vezes será executado o teste.
                 */

                int quantidadeTestes = 1;
                int quantidadeWarmup = 2;
                int quantidadeMedicao = 1;
/*
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
                                   "-i", Integer.toString(quantidadeTestes),
                                "-wi", Integer.toString(quantidadeWarmup),
                                "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkBubbleSortOrdenadosV2.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                                  "-i", Integer.toString(quantidadeTestes),
                                "-wi", Integer.toString(quantidadeWarmup),
                                "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkBubbleSortInvertidoV2.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                                 "-i", Integer.toString(quantidadeTestes),
                                "-wi", Integer.toString(quantidadeWarmup),
                                "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkBubbleSortAleatorioV2.*"
                });
 
                org.openjdk.jmh.Main.main(new String[] {
                        "-i", Integer.toString(quantidadeTestes),
                        "-wi", Integer.toString(quantidadeWarmup),
                        "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkSelectSortOrdenados.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                        "-i", Integer.toString(quantidadeTestes),
                        "-wi", Integer.toString(quantidadeWarmup),
                        "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkSelectSortInvertido.*"
                });
                
                org.openjdk.jmh.Main.main(new String[] {
                        "-i", Integer.toString(quantidadeTestes),
                        "-wi", Integer.toString(quantidadeWarmup),
                        "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkSelectSortAleatorio.*"
                });
        


                org.openjdk.jmh.Main.main(new String[] {
                        "-i", Integer.toString(quantidadeTestes),
                        "-wi", Integer.toString(quantidadeWarmup),
                        "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkMergeSortOrdenados.*"
                });

                org.openjdk.jmh.Main.main(new String[] {
                        "-i", Integer.toString(quantidadeTestes),
                        "-wi", Integer.toString(quantidadeWarmup),
                        "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkMergeSortInvertido.*"
                });
                
                org.openjdk.jmh.Main.main(new String[] {
                        "-i", Integer.toString(quantidadeTestes),
                        "-wi", Integer.toString(quantidadeWarmup),
                        "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkMergeSortAleatorio.*"
                });
        */

                org.openjdk.jmh.Main.main(new String[] {
                        "-i", Integer.toString(quantidadeTestes),
                        "-wi", Integer.toString(quantidadeWarmup),
                        "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkQuickSortOrdenados.*"
                });
                org.openjdk.jmh.Main.main(new String[] {
                        "-i", Integer.toString(quantidadeTestes),
                        "-wi", Integer.toString(quantidadeWarmup),
                        "-f", Integer.toString(quantidadeMedicao),
                        ".*BenchmarkQuickSortInvertido.*"
                });
        
                
                 
                org.openjdk.jmh.Main.main(new String[] {
                        "-i", Integer.toString(quantidadeTestes),
                        "-wi", Integer.toString(quantidadeWarmup),
                        "-f", Integer.toString(quantidadeMedicao),
                                ".*BenchmarkQuickSortAleatorio.*"
                });
        }
}