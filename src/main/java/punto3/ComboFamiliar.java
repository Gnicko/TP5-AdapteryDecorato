package punto3;

public class ComboFamiliar implements Combo {
    @Override
    public String descripcion() {
        return "Combo Familiar: Hamburguesa Papas";
    }

    @Override
    public double precio() {
        return 50;
    }

    @Override
    public void informar() {
        System.out.println(this.descripcion() + "\nPrecio:" + this.precio());
    }
}
