package punto1;

public class MotorElectrico extends Motor {
    private Electrico motorElectrico;

    public MotorElectrico() {
        motorElectrico = new Electrico();
    }

    @Override
    public void arrancar() {
        motorElectrico.conectar();
        motorElectrico.activar();
    }

    @Override
    public void acelerar() {
        motorElectrico.maoverMasRapido();
    }

    @Override
    public void apagar() {
        motorElectrico.detener();
        motorElectrico.deconectar();
    }
}
