
package atividade08;

import java.util.Scanner;

public class Atividade08 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Ex08 funcionario = new Ex08();
            
            System.out.print("Digite o nome do funcionário: ");
            funcionario.setNome(scanner.nextLine());
            
            System.out.print("Digite o salário do funcionário: ");
            funcionario.setSalario(scanner.nextDouble());
            
            System.out.print("Digite o percentual de reajuste: ");
            double percentual = scanner.nextDouble();
            funcionario.reajustarSalario(percentual);
            
            System.out.println("\nInformações do funcionário após reajuste:");
            funcionario.exibirInformacoes();
        }
    }
    
}
