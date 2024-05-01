import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/**
 * Escrever um programa que leia dois vetores (denominadas A e B)
 * com 20 elementos reais. Construir um vetor C, sendo cada elemento
 * do vetor C a subtração de um elemento correspondente do vetor A
 * com um elemento correspondente do vetor B, ou seja,
 * a operação de processamento deve estar baseada na operação
 * C[I] ← A[I] – B[I]. Ao final, apresentar os elementos do vetor C
 */

public class Exercicio03 {
  public static void main(String[] args) {
    int numElementos = 20;
    int[] vetorA = new int[numElementos];
    int[] vetorB = new int[numElementos];
    int[] vetorC = new int[numElementos];

    SecureRandom random = new SecureRandom();
    // Random random = new Random();
    // Entrada de dados
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = random.nextInt(1000, 2000);
      vetorB[i] = random.nextInt(100, 200);
    }
    // Processamento
    for (int indice = 0; indice < vetorC.length; indice++) {
      vetorC[indice] = vetorA[indice] - vetorB[indice];
    }

    System.out.println("Vetor A" + Arrays.toString(vetorA));
    System.out.println("Vetor B" + Arrays.toString(vetorB));
    System.out.println("Vetor C" + Arrays.toString(vetorC));
  }
}