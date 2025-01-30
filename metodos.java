import java.util.Scanner;



public class metodos {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    //declaração universal scanner. "objetificando" sc

    System.err.println("Digite um número");
    int Numero1 = sc.nextInt();

    System.err.println("Digite um número");
    int Numero2 = sc.nextInt();

        int soma = Numero1 + Numero2;

    System.out.print("Sua soma é: " + soma);


    }
}