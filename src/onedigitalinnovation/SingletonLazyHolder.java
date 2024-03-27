package onedigitalinnovation;

public class SingletonLazyHolder {

    private static class InstanceHolder {
       public static SingletonLazyHolder instancia = instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}
