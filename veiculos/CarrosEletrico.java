package veiculos;

import interfaces.IVeiculoEletrico;

public class CarrosEletrico extends Veiculo implements IVeiculoEletrico {
    private int autonomia;

    public CarrosEletrico(String modelo, String marca, int ano, int autonomia) {
        super(modelo, marca, ano);
        this.autonomia = autonomia;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Carro Elétrico: " + getModelo() + " " + getMarca() + " " + getAno());
        System.out.println("Autonomia: " + autonomia + " km");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando a bateria do carro elétrico...");
    }
}

