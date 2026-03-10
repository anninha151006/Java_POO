import java.util.Scanner;


public class media{
    public static void  main (String[]args){
        Scanner meu_Scanner = new Scanner (System.in);

        double media, n1, n2 , ppd;

        System.out.println ("Digite a nota numero 1: ");
        n1 = meu_Scanner.nextDouble();

        System.out.println ("Digite a nota numero 2: ");
        n2 = meu_Scanner.nextDouble();

        System.out.println ("Digite a nota do ppd: ");
        ppd = meu_Scanner.nextDouble();

        media = (n1 + n2 + ppd)/3;
        System.out.println ("A media e: "+ media);

    } 
    
}
