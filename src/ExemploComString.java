import java.util.Arrays;

public class ExemploComString {
  public static void main(String[] args) {

    char[] nome = { 'C', 'e', 'z', 'a', 'r' };
    String nomeString = new String(nome);
    System.out.println(nomeString);
    char[] letras = nomeString.toCharArray();
    System.out.println(Arrays.toString(letras));
    for (int i = 0; i < letras.length; i++) {
      System.out.println(letras[i]);
    }
  }
}