Este projeto consiste na implementação e análise de desempenho de algoritmos de ordenação. Os algoritmos implementados são:

- Bubble Sort
- Bubble Sort Versão 1
- Bubble Sort Versão 2
- Insert Sort
- Select Sort
- Merge Sort
- Quick Sort
- Heap Sort

## Dados para teste
Para realizar os testes de desempenho, foram utilizados os seguintes conjuntos de dados:

- Lista de números ordenados: uma lista de 1 a 1.000.000 em ordem crescente.
- Lista de números inversamente ordenados: uma lista de 1.000.000 a 1 em ordem decrescente.
- Lista de números aleatórios: uma lista de 1.000.000 de números gerados aleatoriamente.

## Especificações da Máquina

Para realizar os testes de desempenho, foram utilizadas as seguintes especificações de hardware:

- Processador: Intel(R) Xeon(R) CPU E5-2430 0 @ 2.20GHz   2.20 GHz
- Memória RAM: 16 GB
- Tipo de Armazenamento: 480 GB SSD
- O sistema operacional utilizado foi: Windows 11 Pro

É importante observar que as características do hardware e do sistema operacional podem influenciar nos resultados obtidos.

## Benchmark utilizando JMH (Java Microbenchmark Harness)

Nesta seção, apresentamos informações detalhadas sobre o ambiente de benchmark utilizado, incluindo a versão do JMH, a versão da VM Java, as opções de VM, o modo de execução e as configurações específicas.


### Ambiente de Benchmark
- **JMH version:** 1.32: A versão do JMH que está sendo utilizada para os benchmarks.

- **VM version:** JDK 17.0.10, OpenJDK 64-Bit Server VM, 17.0.10+7: A versão da máquina virtual Java (VM) que está sendo utilizada para executar os benchmarks. É a versão do JDK (Java Development Kit) e a versão específica da VM.

- **Blackhole:** full + dont-inline hint: Garante consumo de operações e evita otimizações.

- **Warmup:** 2 iterações, 10 segundos cada. Prepara o código, carrega na memória e permite que a JVM otimize para um desempenho mais estável antes das medições reais dos benchmarks.

- **Measurement:** 1 iteração, 10 segundos cada: A fase de medição dos benchmarks. Será realizada uma iteração com duração de 10 segundos para coletar as medições de desempenho.

- **Timeout:** 10 minutos por iteração: O tempo máximo permitido para a execução de cada iteração dos benchmarks. Caso uma iteração ultrapasse esse limite de tempo, ela será interrompida.

- **Threads:** 1 thread, será sincronizada nas iterações: O número de threads que serão utilizadas durante os benchmarks. Nesse caso, será utilizada apenas uma thread, que será sincronizada nas iterações para garantir a consistência dos resultados.

- **Modo de benchmark:** Tempo médio, tempo/op: O modo de benchmark que está sendo utilizado para medir o desempenho. Será calculado o tempo médio de execução de cada operação (tempo/op), fornecendo uma medida de desempenho mais precisa.

Essas informações fornecem detalhes sobre o ambiente de benchmark usado para realizar as medições de desempenho dos algoritmos de ordenação. É importante observar que essas configurações podem afetar os resultados obtidos e devem ser levadas em consideração ao interpretar os dados apresentados.

## Resultados e Métricas

Os algoritmos de ordenação foram testados e as seguintes métricas foram coletadas:

- Quantidade de comparações efetuadas
- Número de trocas realizadas
- Tempo total de execução em segundos

Os resultados obtidos foram organizados em tabelas e gráficos para facilitar a análise comparativa. A seguir, apresentamos os resultados obtidos para cada algoritmo de ordenação.

### Bubble Sort

#### Ordenado

| Tamanho do Vetor | Tipo         | Comparações | Trocas            | Tempo de Execução (s)|
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Ordernado   |99990000     | 0                 | 0,053                |
| 100000            | Ordernado   |9999900000   | 0                 | 5,036                |
| 1000000           | Ordernado   |999999000000 | 0                 | 500,068              |

#### Inversamente Ordenado

| Tamanho do Vetor | Tipo         | Comparações | Trocas | Tempo de Execução (s) |
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Invertido   |99990000     | 49995000          | 0,142                |
| 100000            | Invertido   |9999900000   | 4999950000        | 13,869               |
| 1000000           | Invertido   |999999000000 | 499999500000      | 1309,991             |

#### Ordem Aleatoria
| Tamanho do Vetor | Tipo         | Comparações | Trocas | Tempo de Execução (s) |
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Aleatorio   |99990000     | 25192090          | 0,218                |
| 100000            | Aleatorio   |9999900000   | 2497055573        | 22,576               |
| 1000000           | Aleatorio   |999999000000 | 249933933249      | 2280,143             |

### Bubble Sort V1

#### Ordenado

| Tamanho do Vetor | Tipo         | Comparações | Trocas | Tempo de Execução (s) |
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Ordernado   |49995000     | 0                 | 0,025                |
| 100000            | Ordernado   |4999950000   | 0                 | 5,036                |
| 1000000           | Ordernado   |499999500000 | 0                 | 227,584              |


#### Inversamente Ordenado

| Tamanho do Vetor | Tipo         | Comparações | Trocas | Tempo de Execução (s) |
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Invertido   |49995000     | 49995000          | 0,049                |
| 100000            | Invertido   |4999950000   | 4999500000        | 13,869               |
| 1000000           | Invertido   |499999500000 | 499999500000      | 452,442              |

#### Ordem Aleatoria

| Tamanho do Vetor | Tipo         | Comparações | Trocas          | Tempo de Execução (s)  |
|------------------|--------------|-------------|-----------------|------------------------|
| 10000            | Aleatorio    | 49995000    | 25032809        | 0,154                  |
| 100000           | Aleatorio    | 4999950000  | 924942809       | 22,576                 |
| 1000000          | Aleatorio    | 499999500000| 249933933249    | 1668,771               |


### Bubble Sort V2
#### Ordenado
| Tamanho do Vetor | Tipo         | Comparações | Trocas | Tempo de Execução (s) |
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Ordernado   |9999         | 0                 | 0,001                |
| 100000            | Ordernado   |9999900000   | 0                 | 0,009               |
| 1000000           | Ordernado   |999999000000 | 0                 | 0,089                |


#### Inversamente Ordenado
| Tamanho do Vetor | Tipo          | Comparações | Trocas | Tempo de Execução (s) |
|------------------|---------------|-------------|-------------------|----------------------|
| 10000             | Invertido    | 99990000    | 49995000          | 0,140                |
| 100000            | Invertido    | 1000089999  | 4999500000        | 13,869               |
| 1000000           | Invertido    | 999999000000| 499999500000      | 1316,679             |


#### Ordem Aleatoria

| Tamanho do Vetor | Tipo         | Comparações | Trocas | Tempo de Execução (s) |
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Aleatorio   |98470152     | 25032809          | 0,187                |
| 100000            | Aleatorio   |999990000    | 924942809         | 22,576               |
| 1000000           | Aleatorio   |997615002384 | 249933933249      | 2102,976             |

### Insert Sort

#### Ordenado
| Tamanho do Vetor | Tipo        | Comparações  | Trocas            | Tempo de Execução (s)|
|------------------|-------------|--------------|-------------------|----------------------|
| 10000            | Ordernado   | 9999         | 0                 | 0,001                |
| 100000           | Ordernado   | 99999        | 0                 | 0,009                |
| 1000000          | Ordernado   | 999999       | 0                 | 0,092                |


#### Inversamente Ordenado
| Tamanho do Vetor | Tipo         | Comparações | Trocas            | Tempo de Execução (s)|
|------------------|--------------|-------------|-------------------|----------------------|
| 10000            | Invertido    | 9999        | 49995000          | 0,037                |
| 100000           | Invertido    | 99999       | 4999950000        | 12,993               |
| 1000000          | Invertido    | 999999      | 499999500000      | 1368,534             |


#### Ordem Aleatoria

| Tamanho do Vetor | Tipo         | Comparações | Trocas           | Tempo de Execução (s)|
|------------------|--------------|-------------|------------------|----------------------|
| 10000            | Aleatorio    | 9999        | 25187530         | 0,023                |
| 100000           | Aleatorio    | 99999       | 2501955256       | 1,970                |
| 1000000          | Aleatorio    | 999999      | 250179051997     | 680,213              |


### Select Sort

#### Ordenado
| Tamanho do Vetor | Tipo         | Comparações | Trocas | Tempo de Execução (s) |
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Ordernado   |49995000     | 0                 | 0,025                |
| 100000            | Ordernado   |4999950000   | 0                 | 5,036                |
| 1000000           | Ordernado   |499999500000 | 0                 | 221,664              |


#### Inversamente Ordenado
| Tamanho do Vetor  | Tipo         | Comparações | Trocas            | Tempo de Execução (s)|
|-------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Invertido    | 49995000    | 5000              | 0,101                |
| 100000            | Invertido    | 4999950000  | 50000             | 13,869               |
| 1000000           | Invertido    | 499999500000| 500000            | 526,203              |


#### Ordem Aleatoria
| Tamanho do Vetor  | Tipo         | Comparações  | Trocas            | Tempo de Execução (s)|
|-------------------|--------------|--------------|-------------------|----------------------|
| 10000             | Aleatorio    | 49995000     | 9990              | 0,034                |
| 100000            | Aleatorio    | 4999950000   | 99990             | 22,576               |
| 1000000           | Aleatorio    | 499999500000 | 999989            | 291,880              |

### Merge Sort

#### Ordenado
| Tamanho do Vetor | Tipo         | Comparações  | Trocas            | Tempo de Execução (s)|
|------------------|--------------|--------------|-------------------|----------------------|
| 10000            | Ordernado    | 69008        | 133616            | 0,075                |
| 100000           | Ordernado    | 853904       | 1668928           | 6,765                |
| 1000000          | Ordernado    | 10066432     | 19951424          | 672,852              |


#### Inversamente Ordenado
| Tamanho do Vetor  | Tipo         | Comparações  | Trocas            | Tempo de Execução (s) |
|-------------------|--------------|--------------|-------------------|-----------------------|
| 10000             | Invertido    | 64608        | 133616            | 0,076                 |
| 100000            | Invertido    | 815024       | 1668928           | 6,801                 |
| 1000000           | Invertido    | 9884992      | 19951424          | 680,382               |


#### Ordem Aleatoria
| Tamanho do Vetor | Tipo         | Comparações | Trocas            | Tempo de Execução (s)|
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Aleatorio   | 120421      | 133616            | 0,077                |
| 100000            | Aleatorio   | 1536369     | 1668928           | 6,937                |
| 1000000           | Aleatorio   | 9884992     | 19951424          | 681,039              |

### Quick Sort

#### Ordenado
| Tamanho do Vetor  | Tipo         | Comparações | Trocas            | Tempo de Execução (s)|
|-------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Ordernado    | 9999        | 0                 | 0,001                |
| 100000            | Ordernado    | 99999       | 0                 | 0,014                |
| 1000000           | Ordernado    | 999999      | 0                 | 0,119                |


#### Inversamente Ordenado
| Tamanho do Vetor  | Tipo        | Comparações  | Trocas            | Tempo de Execução (s) |
|-------------------|-------------|--------------|-------------------|-----------------------|
| 10000             | Invertido   | 14999        | 5000              | 0,001                 |
| 100000            | Invertido   | 149999       | 50000             | 0,012                 |
| 1000000           | Invertido   | 1499999      | 500000            | 0,123                 |


#### Ordem Aleatoria
| Tamanho do Vetor | Tipo         | Comparações | Trocas            | Tempo de Execução (s)|
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Aleatorio   |41151        | 31152             | 0,002                |
| 100000            | Aleatorio   |487904       | 387905            | 0,022                |
| 1000000           | Aleatorio   |5588676      | 4588677           | 0,230                |


### Heap Sort

#### Ordenado
| Tamanho do Vetor | Tipo         | Comparações | Trocas            | Tempo de Execução (s)|
|------------------|--------------|-------------|-------------------|----------------------|
| 10000             | Ordernado   |136956       | 9999              | 0,002                |
| 100000            | Ordernado   |273609       | 99999             | 0,023                |
| 1000000           | Ordernado   |1623609      | 999999            | 0,229                |


#### Inversamente Ordenado
| Tamanho do Vetor | Tipo         | Comparações | Trocas            | Tempo de Execução (s) |
|------------------|--------------|-------------|-------------------|-----------------------|
| 10000             | Invertido   |121696       | 9999              | 0,002                 |
| 100000            | Invertido   |263630       | 99999             | 0,023                 |
| 1000000           | Invertido   |1613630      | 999999            | 0,242                 |


#### Ordem Aleatoria
| Tamanho do Vetor | Tipo         | Comparações | Trocas            | Tempo de Execução (s) |
|------------------|--------------|-------------|-------------------|-----------------------|
| 10000             | Aleatorio   |129126       | 9999              | 0,003                 |
| 100000            | Aleatorio   |270993       | 99999             | 0,027                 |
| 1000000           | Aleatorio   |1620993      | 999999            | 0,314                 |



Os resultados apresentados demonstram a eficiência e o desempenho de cada algoritmo de ordenação, levando em consideração as métricas essenciais mencionadas.

## Conclusão

Através da análise comparativa dos resultados obtidos, é possível observar como as características do hardware e do sistema operacional podem influenciar no desempenho dos algoritmos de ordenação. Essa compreensão mais profunda nos permite avaliar a melhor escolha de algoritmo de ordenação de acordo com o contexto de uso.
