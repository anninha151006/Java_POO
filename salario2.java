import java.util.Scanner;

public class salario2 {
    public static void main(String[] args) {
       Scanner  Scanf = new Scanner (System.in);

       Double salario, salario_final , aumento;
       int porcentagem = 25;
       

       System.out.println("Insira aqui seu Salario: ");
       salario = Scanf.nextDouble();

       
       aumento = (salario * porcentagem)/100;
       salario_final = salario + aumento;

       System.out.println("O salario final e: "+ aumento);
       System.out.println("O salario final e: "+ salario_final);
    }
}
