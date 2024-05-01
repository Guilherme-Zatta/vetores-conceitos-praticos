import java.util.Arrays;

public class Exemplo03 {
  public static void main(String[] args) {
    // Crie um vetor A de 8 elementos inteiros
    // e um segundo vetor chamado B de 8 elementos inteiros.
    // Crie um novo vetor que é a soma dos dois vetores.
    int[] vetorA = { 1, 2, 44, 32, 92, 59, 77, 22 };
    int[] vetorB = { 45, 33, 41, 87, 70, 10, 21, 58 };
    // [ 1, 2, 44, 32, 92, 59, 77, 22, 45, 33, 41, 87, 70, 10, 21, 58 ]
    // int[] vetorA = { 1, 2 };
    // int[] vetorB = { 45, 33 };
    // [ 1, 2, 45, 33 ]
    int numElementosVetorC = vetorA.length + vetorB.length;
    int[] vetorC = new int[numElementosVetorC];

    int contador = 0;
    int indiceVetor = 0;

    while (contador < numElementosVetorC) {
      // mudar para o vetorB
      if (indiceVetor >= vetorA.length) {
        indiceVetor = 0;
      }

      if (contador < vetorA.length) {
        vetorC[contador] = vetorA[indiceVetor];
      } else {
        vetorC[contador] = vetorB[indiceVetor];
      }

      indiceVetor++;
      contador++;
    }

    System.out.println("Vetor A" + Arrays.toString(vetorA));
    System.out.println("Vetor B" + Arrays.toString(vetorB));
    System.out.println("Vetor C" + Arrays.toString(vetorC));
  }
}