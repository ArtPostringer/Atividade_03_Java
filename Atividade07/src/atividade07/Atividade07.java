package atividade07;

import java.util.Scanner;

public class Atividade07 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Ex07 carro = new Ex07();
            
            System.out.print("Digite o modelo do carro: ");
            carro.setModelo(scanner.nextLine());
            
            System.out.print("Digite o consumo do carro (km por litro): ");
            carro.setConsumoPorKm(scanner.nextDouble());
            
            System.out.print("Digite a distância da viagem (km): ");
            double distancia = scanner.nextDouble();
            
            System.out.print("Digite o preço do combustível (por litro): ");
            double precoCombustivel = scanner.nextDouble();
            
            double consumoTotal = carro.calcularConsumo(distancia);
            double custoViagem = carro.estimarCustoViagem(distancia, precoCombustivel);
            
            System.out.println("\nResumo da viagem:");
            System.out.println("Modelo do carro: " + carro.getModelo());
            System.out.println("Consumo total de combustível: " + consumoTotal + " litros");
            System.out.println("Custo estimado da viagem: R$ " + custoViagem);
        }
    }

}
