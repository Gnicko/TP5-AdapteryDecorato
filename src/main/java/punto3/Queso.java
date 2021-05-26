package punto3;

public class Queso implements Combo {
    private final int PRECIO_QUESO = 5;
    private Combo combo;

    public Queso(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " Queso";
    }

    @Override
    public double precio() {
        return combo.precio() + PRECIO_QUESO;
    }

    @Override
    public void informar() {
        System.out.println(this.descripcion() + "\nPrecio:" + this.precio());
    }
}
