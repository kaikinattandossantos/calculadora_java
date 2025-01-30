import java.util.Scanner;

public class calculadora {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //declaração universal scanner. "objetificando" sc

    System.err.println("Digite um número");
    int Numero1 = sc.nextInt();

    System.err.println("Digite um número");
    int Numero2 = sc.nextInt();

        int multiplicacao = Numero1 * Numero2;
        int soma = Numero1 + Numero2;
        int subtracao = Numero1 - Numero2;
        int divisao = Numero1 / Numero2;


    System.out.println("Qual método que aplicar?: ");
    String metodo = sc.next();
    if (metodo.equalsIgnoreCase("soma")) {
        System.out.print("Sua soma é: " + soma);
    }
    if (metodo.equalsIgnoreCase("divisao")) {
        System.out.print("Sua divisão é: " + divisao);
    }
    if (metodo.equalsIgnoreCase("subtracao")) {
        System.out.print("Sua subtração é: " + subtracao);
    }
    if (metodo.equalsIgnoreCase("multiplicacao")) {
        System.out.print("Sua multiplicação é: " + multiplicacao);
    }

    }
}