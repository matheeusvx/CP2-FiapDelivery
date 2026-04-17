package br.com.fiapdelivery.app;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Veiculo;
import br.com.fiapdelivery.service.Rota;

public class Principal {
    public static void main(String[] args) {

        Veiculo caminhao = new Caminhao("PYZ9674", 500.0, 6);

        Pacote pacote = new Pacote("BHJ865", 10.5);

        Rota rota = new Rota(pacote, caminhao);
        rota.iniciarEntrega();
    }
}
