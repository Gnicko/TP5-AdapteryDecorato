package punto3;

public class Main {
    public static void main(String[] args) {
        Combo combo1 = new ComboBasico();
        combo1 = new Carne(combo1);
        combo1 = new Papas(combo1);
        combo1.informar();

        Combo combo2 = new Queso(new Carne(new Tomate(new ComboEspecial())));
        combo2.informar();

        Combo combo3 = new Papas(new Tomate(new Carne(new ComboFamiliar())));
        combo3.informar();
    }
}
