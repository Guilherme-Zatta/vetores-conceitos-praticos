import java.util.Scanner;

public class ExemploComVariaveis {
  public static void main(String[] args) {
    // informar quatro notas e fazer a média
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe a nota 1");
    double nota1 = scanner.nextDouble();

    System.out.println("Informe a nota 2");
    double nota2 = scanner.nextDouble();

    System.out.println("Informe a nota 3");
    double nota3 = scanner.nextDouble();

    System.out.println("Informe a nota 4");
    double nota4 = scanner.nextDouble();

    System.out.println("Informe a nota 5");
    double nota5 = scanner.nextDouble();

    double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;

    System.out.println(media);

    scanner.close();
  }
}