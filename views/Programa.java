package views;

import veiculos.Carro;
import veiculos.CarrosEletrico;

public class Programa {
	public static void main(String[] args) {
		Carro carro = new Carro("Civic", "Honda", 2023, 4);
		carro.mostrarDetalhes();

		CarrosEletrico carE = new CarrosEletrico("Model S", "Tesla", 2023, 400);
		carE.mostrarDetalhes();
		carE.carregarBateria();
	}   
}
