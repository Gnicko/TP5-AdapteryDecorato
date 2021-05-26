package punto3;

public class ComboEspecial implements Combo {
    @Override
    public String descripcion() {
        return "Combo Especial: Hamburguesa Tomate Carne Papas";
    }

    @Override
    public double precio() {
        return 100;
    }

    @Override
    public void informar() {
        System.out.println(this.descripcion() + "\nPrecio:" + this.precio());
    }
}
