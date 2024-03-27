import onedigitalinnovation.SingletonEagle;
import onedigitalinnovation.SingletonLazy;
import onedigitalinnovation.SingletonLazyHolder;

public class Main {
    public static void main(String[] args) {

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
    }
}