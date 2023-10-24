abstract class Juguete {
    protected int id;
    protected String color;
    protected String color;
    protected String marca;
    protected int numeroPuertas;

    public Juguete(String marca, int numeroPuertas) {
        this.id = id;
        this.color = color;
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
    }

    public int getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract Juguete clonar();

    public void imprimir() {
        System.out.println("Carrito #" + id);
        System.out.println("Color: " + color);
        System.out.println("Marca: " + marca);
        System.out.println("Número de Puertas: " + numeroPuertas);
    }
}
