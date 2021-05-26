package punto3;

public class Tomate implements Combo {
    private Combo combo;
    private final int PRECIO_TOMATE = 5;

    public Tomate(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " Tomate";
    }

    @Override
    public double precio() {
        return combo.precio() + PRECIO_TOMATE;
    }

    @Override
    public void informar() {
        System.out.println(this.descripcion() + "\nPrecio:" + this.precio());
    }
}
