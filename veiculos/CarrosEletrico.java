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
        System.out.println("Carro El�trico: " + getModelo() + " " + getMarca() + " " + getAno());
        System.out.println("Autonomia: " + autonomia + " km");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando a bateria do carro el�trico...");
    }
}

