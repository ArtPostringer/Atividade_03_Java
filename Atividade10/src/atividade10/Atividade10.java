package atividade10;

import java.util.Scanner;

public class Atividade10 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Ex10 temp = new Ex10();
            
            System.out.print("Digite a temperatura em Celsius: ");
            temp.setCelsius(scanner.nextDouble());
            
            System.out.println("\nConversões de temperatura:");
            temp.exibirTemperaturas();
        }
    }
}