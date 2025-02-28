
package exercicio09;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        Circulo circulo1 = new Circulo();
        
        System.out.println("Informe o valor do raio:");
        circulo1.setRaio(ler.nextDouble());
    
        
        circulo1.mostrarResultado();
        System.out.println("Valor do raio informado:" + circulo1.getRaio());
    }
}
