package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
    private boolean possuiBau;

    public Moto(String placa, double capacidade, boolean ispossuiBau) {
        super(placa, capacidade);
        this.possuiBau = ispossuiBau;
    }

    public boolean isPossuiBau() {
        return possuiBau;
    }
}
