package atividade05;

import java.util.Scanner;

public class Atividade05 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Ex05 conta = new Ex05();

            System.out.print("Digite o nome do titular: ");
            conta.setTitular(scanner.nextLine());

            System.out.print("Digite o saldo inicial: ");
            conta.setSaldo(scanner.nextDouble());

            conta.exibirSaldo();

            System.out.print("Digite o valor para depósito: ");
            conta.depositar(scanner.nextDouble());
            conta.exibirSaldo();

            System.out.print("Digite o valor para saque: ");
            conta.sacar(scanner.nextDouble());
            conta.exibirSaldo();

            System.out.print("Digite a taxa de juros para rendimento: ");
            double taxa = scanner.nextDouble();
            System.out.println("Rendimento: R$" + conta.calcularRendimento(taxa));
        }
    }

}
