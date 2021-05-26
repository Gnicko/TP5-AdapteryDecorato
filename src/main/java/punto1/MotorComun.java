package punto1;

public class MotorComun extends Motor{
    @Override
    public void arrancar() {
        System.out.println("Arrancando motor Comun");
    }

    @Override
    public void acelerar() {
        System.out.println("Aceleranco motor Comun");

    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor Comun");
    }
}
