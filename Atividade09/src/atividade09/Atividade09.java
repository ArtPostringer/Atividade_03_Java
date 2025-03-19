
package atividade09;

import java.util.Scanner;

public class Atividade09 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Ex09 livro = new Ex09();
            
            System.out.print("Digite o título do livro: ");
            livro.setTitulo(scanner.nextLine());
            
            System.out.print("Digite o autor do livro: ");
            livro.setAutor(scanner.nextLine());
            
            System.out.print("Digite o total de páginas do livro: ");
            livro.setTotalPaginas(scanner.nextInt());
            
            System.out.print("Digite o número de páginas lidas: ");
            livro.setPaginasLidas(scanner.nextInt());
            
            System.out.println("\nInformações do livro:");
            livro.exibirInformacoes();
        }
    }
}