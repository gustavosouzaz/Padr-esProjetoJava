import onedigitalinnovation.Singleton.SingletonEagle;
import onedigitalinnovation.Singleton.SingletonLazy;
import onedigitalinnovation.Singleton.SingletonLazyHolder;
import onedigitalinnovation.Singleton.Strategy.*;

public class Main {
    public static void main(String[] args) {

        //Singleton

        SingletonLazy lazy =  SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEagle eager =  SingletonEagle.getInstancia();
        System.out.println(eager);
        eager = SingletonEagle.getInstancia();
        System.out.println(eager);


        SingletonLazyHolder lazyholder =  SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);


        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();



    }
}