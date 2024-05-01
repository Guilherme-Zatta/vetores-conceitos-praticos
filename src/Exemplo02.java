import java.util.Arrays;
import java.util.Scanner;

public class Exemplo02 {
  public static void main(String[] args) {
    // solicite os valores de salário de janeiro a dezembro e armazene em uma lista
    // os salários
    // em outra lista os valores de imposto de renda (5% de imposto).

    // declarar uma lista de 12 itens do tipo double para os salários
    double[] salarios = new double[12];
    // declarar uma lista de 12 itens do tipo double para os impostos
    double[] impostos = new double[12];

    final double percentualImposto = 5.0;

    Scanner scanner = new Scanner(System.in);
    // percorrer a lista solicitando mes a mes o salario
    for (int contador = 0; contador < salarios.length; contador++) {
      System.out.printf("Informe o salário do mês %d: ", contador + 1);
      salarios[contador] = scanner.nextDouble();
    }

    // mostrar os valores das listas
    System.out.println(Arrays.toString(salarios));
    System.out.println(Arrays.toString(impostos));

    for (int i = 0; i < salarios.length; i++) {
      // armazenar na mesma posição do mês do salário o valor de IRPF
      impostos[i] = (salarios[i] * percentualImposto) / 100;
      System.out.printf("Salário: R$ %.2f -> Imposto R$ %.2f\n",
          salarios[i],
          impostos[i]);
    }

    scanner.close();
  }
}