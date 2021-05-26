package punto3;

public class Papas implements Combo {
    private Combo combo;
    private final int PRECIO_PAPAS = 15;

    public Papas(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " Papas";
    }

    @Override
    public double precio() {
        return combo.precio() + PRECIO_PAPAS;
    }

    @Override
    public void informar() {
        System.out.println(this.descripcion() + "\nPrecio:" + this.precio());
    }
}
