package punto1;

public class MotorEconomico extends Motor{
    @Override
    public void arrancar() {
        System.out.println("Arrancando motor Economico");
    }

    @Override
    public void acelerar() {
        System.out.println("Aceleranco motor Economico" );

    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor Economico");
    }
}
