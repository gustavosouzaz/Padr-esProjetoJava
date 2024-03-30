package onedigitalinnovation.Singleton.subsistema2.cep;

import onedigitalinnovation.Singleton.SingletonEagle;

public class cepAPI {

    private static cepAPI instancia = instancia = new cepAPI();

    private cepAPI() {
        super();
    }

    public static cepAPI getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Araraquara";
    }
    public String recuperarEstado(String estado) {
        return "SP";
    }

}
