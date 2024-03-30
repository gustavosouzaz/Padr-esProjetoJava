package onedigitalinnovation.Singleton.Facade;

import onedigitalinnovation.Singleton.subsistema1.crm.crmService;
import onedigitalinnovation.Singleton.subsistema2.cep.cepAPI;

public class Facade {

    public void migrarCliente(String nome, String cep) {

        String cidade = cepAPI.getInstancia().recuperarCidade(cep);
        String estado = cepAPI.getInstancia().recuperarEstado(cep);

        crmService.gravarCliente(nome,cep,cidade,estado);

    }

}
