
import java.util.Scanner;

class soma{
    public static void main (String[]args){
        Scanner meu_Scanner = new Scanner (System.in);

        int soma, n1, n2, n3, n4;

    System.out.println ("Digite o primeiro numero: ");
    n1 = meu_Scanner.nextInt();

    System.out.println ("Digite o segundo numero: ");
    n2 = meu_Scanner.nextInt();

    System.out.println ("Digite o terceiro numero: ");
    n3 = meu_Scanner.nextInt();
    
    System.out.println ("Digite o quarto numero: ");
    n4  = meu_Scanner.nextInt();

    soma = n1 + n2 + n3 + n4;

    System.out.println("A soma e: " +soma);
    }
}