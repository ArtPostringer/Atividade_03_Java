package atividade02;

public class Atividade02 {

    public static void main(String[] args) {
        Ex02 ex02 = new Ex02();
        ex02.setNome("Carlos");
        ex02.setIdade(25);
        ex02.setAltura(1.75);

        ex02.exibirDados();

        if (ex02.maiorDeIdade()) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        System.out.println("Anos para atingir 100 anos: " + ex02.anosParaCem());
    }

}
