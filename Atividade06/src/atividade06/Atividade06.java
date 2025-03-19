
package atividade06;

import java.util.Scanner;

public class Atividade06 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            Ex06 aluno = new Ex06();
            
            System.out.println("Digite o nome do aluno:");
            aluno.setNome(ler.nextLine());
            
            System.out.println("Digite a primeira nota do aluno:");
            aluno.setNota1(ler.nextDouble());
            
            System.out.println("Digite a segunda nota do aluno:");
            aluno.setNota2(ler.nextDouble());
            
            aluno.exibirDadosAluno();
        }
    }
}