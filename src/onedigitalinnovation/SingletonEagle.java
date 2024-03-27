package onedigitalinnovation;

public class SingletonEagle {

    private static SingletonEagle instancia = instancia = new SingletonEagle();

    private SingletonEagle() {
        super();
    }

    public static SingletonEagle getInstancia() {
        return instancia;
    }

}
