package onedigitalinnovation.Singleton.subsistema1.crm;

public class crmService {

   private crmService() {
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);


    }

}
