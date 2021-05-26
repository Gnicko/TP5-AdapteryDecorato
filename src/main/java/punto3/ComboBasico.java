package punto3;

public class ComboBasico implements Combo {
    @Override
    public String descripcion() {
        return "Combo Basico: Hamburguesa";
    }

    @Override
    public double precio() {
        return 20;
    }

    @Override
    public void informar() {
        System.out.println(this.descripcion() + "\nPrecio:" + this.precio());
    }

}
