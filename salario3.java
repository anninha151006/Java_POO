package POO.java;

import java.util.Scanner;

public class salario3 {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        
        System.out.print("Digite o salario base do funcionario: R$ ");
        double salarioBase = scanf.nextDouble();
        
        if (salarioBase < 0) {
            System.out.println("Erro: O salario nao pode ser negativo!");
            scanf.close();
            return;
        }
        
        double percentualGratificacao = 5.0;
        double percentualImposto = 7.0;
        
        double valorGratificacao = salarioBase * (percentualGratificacao / 100);
        
        double valorImposto = salarioBase * (percentualImposto / 100);
        
        double salarioAReceber = salarioBase + valorGratificacao - valorImposto;
        
        System.out.println("\n-- Calculo do Salario  --");
        System.out.printf("Salario Base: R$ %.2f\n", salarioBase);
        System.out.printf("Gratificacao (5%%): R$ +%.2f\n", valorGratificacao);
        System.out.printf("Imposto (7%%): R$ -%.2f\n", valorImposto);
        System.out.printf("Salario a Receber: R$ %.2f\n", salarioAReceber);
        
        scanf.close();
    }
}
