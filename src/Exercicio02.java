import java.util.Arrays;
import java.util.Scanner;

/**
 * Elaborar um programa que leia
 * oito elementos inteiros em um vetor A.
 * Construir um vetor B de mesma dimensão
 * com os elementos do vetor A multiplicados por 3.
 * O elemento B[1] deve ser implicado
 * pelo elemento A[1] * 3, o elemento B[2]
 * implicado pelo elemento A[2] * 3,
 * e assim por diante, até 8. Apresentar a vetor B
 */

public class Exercicio02 {
  public static void main(String[] args) {
    // 1 - criar um vetor A com 8 posicoes
    final int numPosicoes = 8;
    int[] vetorA = new int[numPosicoes];
    // 2 - criar um vetor B com 8 posicoes
    int[] vetorB = new int[numPosicoes];



    // 3 - inicilizar o vetor A com valores
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Informe um número: ");
      vetorA[i] = scanner.nextInt();
    }
    // 4 - alimentar o vetor B baseado nos valores do vetor A
    for (int i = 0; i < vetorA.length; i++){
      vetorB[i] = vetorA[i] * 3;
    }
    System.out.println("Vetor A: " + Arrays.toString(vetorA));
    System.out.println("Vetor B: " + Arrays.toString(vetorB));
    scanner.close();
  }
}