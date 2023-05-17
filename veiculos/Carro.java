package veiculos;

public class Carro extends Veiculo {
	private int numPortas;

	public Carro(String modelo, String marca, int ano, int numPortas) {
		super(modelo, marca, ano);
	    this.numPortas = numPortas;
	    }

	@Override
	public void mostrarDetalhes() {
		System.out.println("Carro: " + getModelo() + " " + getMarca() + " " + getAno());
		System.out.println("Número de Portas: " + numPortas);
		}

}
