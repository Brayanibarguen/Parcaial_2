public class Carrito extends Juguete {

    public Carrito(String color, String marca, int numeroPuertas) {
        super(marca, numeroPuertas);
        this.color = color;
    }

    @Override
    public Juguete clonar() {
        return new Carrito(color, marca, numeroPuertas);
    }

}