import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de notas: ");
        int quantidadeNotas = scanner.nextInt();
        
        // Lista de números de ponto flutuante
        double[] notas = new double [quantidadeNotas];
        
        // informar quantidade de notas e fazer a média
        double somaNotas = 0;

        for(int i = 0; i < notas.length; i ++) {
            System.out.printf("Informe a nota %d: ", (i+1));
            System.out.println();
            notas[i] = scanner.nextDouble();
            somaNotas = somaNotas + notas[i];
        }

        double media = somaNotas / notas.length;
    //    System.out.println(media);

        int contador = 0;
        while (contador < notas.length) {
            System.out.printf("Nota %d: %.2f\n", (contador + 1), notas[contador]);
            contador++;
        }

        System.out.printf("\nMédia: %.2f\n", media);

        if (media >= 7) {
            System.out.println("APROVADO");
        } else if (media >= 5) {
            System.err.println("RECUPERAÇÃO");
        } else {
            System.err.println("REPROVADO");
        }

        scanner.close();
    }
}