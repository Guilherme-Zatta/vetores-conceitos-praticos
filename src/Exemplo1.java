import java.util.Scanner;

public class Exemplo1 {
  public static void main(String[] args) {
    // Desenvolver um programa que leia dez elementos
    // numéricos reais de uma matriz A do tipo vetor.
    // Construir uma matriz B de mesmo tipo,
    // observando a seguinte lei de formação:
    // se o valor do índice da matriz A for par,
    // o valor deve ser multiplicado por 5;
    // sendo ímpar, deve ser somado com 5.
    // Ao final, mostrar o conteúdo da matriz A e B.

    int[] A = new int[5];

    Scanner scanner = new Scanner(System.in);

    // Alimentando a lista com 5 números inteiros
    for (int contador = 0; contador < A.length; contador++) {
      System.out.println("Informe um número inteiro");
      A[contador] = scanner.nextInt();
    }

    // Criar a lista B e alimentar ela baseada nos valores da lista A
    int[] B = new int[5];

    for (int i = 0; i < A.length; i++) {
      if (A[i] % 2 == 0) {
        B[i] = A[i] * 5;
      } else {
        B[i] = A[i] + 5;
      }
    }

    // imprimir as duas listas
    int contador = 0;
    while (contador < A.length) {
      System.out.println(A[contador]);
      contador++;
    }

    contador = 0;

    while (contador < B.length) {
      System.out.println(B[contador]);
      contador++;
    }

    scanner.close();

  }
}