package com.example.Benchmark;

import org.openjdk.jmh.Main;
import java.util.HashMap;
import java.util.Map;

public class BenchmarkRunner {
        private static final Map<String, Boolean> benchmarkClasses = new HashMap<>();

        static {

                // Adicione aqui as classes que deseja executar o benchmark

                /*
                 * Exemplo:
                 * Classe: .*BenchmarkBubbleSortOrdenados.bubbleSort.*
                 * Método: bubbleSort
                 *
                 * true: Executa o benchmark
                 * false: Não executa o benchmark
                 * 
                 */

                // Benchmark numeros ordenados
                benchmarkClasses.put(".*BenchmarkBubbleSortOrdenados.bubbleSort.*", true);
                benchmarkClasses.put(".*BenchmarkBubbleSortOrdenadosV1.*", false);
                benchmarkClasses.put(".*BenchmarkBubbleSortOrdenadosV2.*", false);
                benchmarkClasses.put(".*BenchmarkSelectSortOrdenados.*", false);
                benchmarkClasses.put(".*BenchmarkMergeSortOrdenados.*", false);
                benchmarkClasses.put(".*BenchmarkQuickSortOrdenados.*", false);
                benchmarkClasses.put(".*BenchmarkHeapSortOrdenados.*", false);

                // Benchmark numeros invertidos
                benchmarkClasses.put(".*BenchmarkBubbleSortInvertido.bubbleSort.*", true);
                benchmarkClasses.put(".*BenchmarkBubbleSortInvertidoV1.*", false);
                benchmarkClasses.put(".*BenchmarkBubbleSortInvertidoV2.*", false);
                benchmarkClasses.put(".*BenchmarkSelectSortInvertido.*", false);
                benchmarkClasses.put(".*BenchmarkMergeSortInvertido.*", false);
                benchmarkClasses.put(".*BenchmarkQuickSortInvertido.*", false);
                benchmarkClasses.put(".*BenchmarkHeapSortInvertido.*", false);

                // Benchmark numeros aleatorios
                benchmarkClasses.put(".*BenchmarkBubbleSortAleatorio.bubbleSort.*", true);
                benchmarkClasses.put(".*BenchmarkBubbleSortAleatorioV1.*", false);
                benchmarkClasses.put(".*BenchmarkBubbleSortAleatorioV2.*", false);
                benchmarkClasses.put(".*BenchmarkSelectSortAleatorio.*", false);
                benchmarkClasses.put(".*BenchmarkMergeSortAleatorio.*", false);
                benchmarkClasses.put(".*BenchmarkQuickSortAleatorio.*", false);
                benchmarkClasses.put(".*BenchmarkHeapSortAleatorio.*", false);

        }

        public static void main(String[] args) throws Exception {

                /*
                 * Executa o benchmark
                 * org.openjdk.jmh.Main.main(args); Roda o benchmark com as configurações
                 * padrão.
                 */

                //org.openjdk.jmh.Main.main(args);

                /*
                 * -i 1: Quantas vezes será executado o teste.
                 * -wi 2: Quantas vezes será executado antes de começar a medir o tempo.
                 * -f 1: Quantas vezes será executado o teste.
                 */

                // Executa o benchmark com as configurações personalizadas

               int quantidadeTestes = 1;
                int quantidadeWarmup = 2;
                int quantidadeMedicao = 1;

                for (Map.Entry<String, Boolean> entry : benchmarkClasses.entrySet()) {
                        if (entry.getValue()) {
                                Main.main(new String[] {
                                                "-i", Integer.toString(quantidadeTestes),
                                                "-wi", Integer.toString(quantidadeWarmup),
                                                "-f", Integer.toString(quantidadeMedicao),
                                                entry.getKey()
                                });
                        }
                }

                // Fim do benchmark com as configurações personalizadas

        }
}