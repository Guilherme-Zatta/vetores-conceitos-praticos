import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        //1. Elaborar um programa que efetue a leitura de dez nomes de pessoas em um vetor A do tipo texto e apresentá-los em seguida;
        Scanner scanner = new Scanner (System.in);

        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Informe um nome: ", + (i + 1) + ", ");
            nomes [i] = scanner.nextLine();
        }
        
        System.out.println("Nomes informados: ");
        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}