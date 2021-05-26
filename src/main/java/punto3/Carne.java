package punto3;

public class Carne implements Combo {
    private final int PRECIO_CARNE = 20;
    private Combo combo;

    public Carne(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String descripcion() {
        return combo.descripcion() + " Carne";
    }

    @Override
    public double precio() {
        return combo.precio() + PRECIO_CARNE;
    }

    @Override
    public void informar() {
        System.out.println(this.descripcion() + "\nPrecio:" + this.precio());
    }


}
