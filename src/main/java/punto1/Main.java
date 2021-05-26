package punto1;

public class Main {
    public static void main(String[] args) {
        Motor motorElectrico = new MotorElectrico();
        System.out.println("****Motor Electrico****");
        motorElectrico.arrancar();
        motorElectrico.acelerar();
        motorElectrico.apagar();
        System.out.println("\n ****Motor Comun****");
        Motor motorComun = new MotorComun();
        motorComun.arrancar();
        motorComun.acelerar();
        motorComun.apagar();
        System.out.println("\n ****Motor Economico****");
        Motor motorEconomico=new MotorEconomico();
        motorEconomico.arrancar();
        motorEconomico.acelerar();
        motorEconomico.apagar();
    }
}
