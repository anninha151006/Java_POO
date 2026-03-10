import java.util.Scanner;


public class media2{
    public static void  main (String[]args){
        Scanner meu_Scanner = new Scanner (System.in);

        double media, n1, n2 , ppd, p1, p2, p3;

        System.out.println ("Digite a nota  e peso numero 1: ");
        n1 = meu_Scanner.nextDouble();
        p1 = meu_Scanner.nextDouble();
    
        System.out.println ("Digite a nota e peso numero 2: ");
        n2 = meu_Scanner.nextDouble();
        p2 = meu_Scanner.nextDouble();

        System.out.println ("Digite a nota do ppd e peso: ");
        ppd = meu_Scanner.nextDouble();
        p3 = meu_Scanner.nextDouble();

        media = (n1 * p1 + n2 * p2 + ppd * p3)/(p1 + p2 + p3);
        System.out.println ("A media e: "+ media);

    } 
    
}
