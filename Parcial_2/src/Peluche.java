public class Peluche extends Juguete {
    private String materialExterior;
    private String relleno;
    private String color;

    public Peluche(String materialExterior, String relleno, String color) {
        super();
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.color = color;
    }

    public Peluche(int id, String color) {
        super();
    }

    @Override
    public Juguete clonar() {
        return new Peluche(materialExterior, relleno, color);
    }

    @Override
    public void imprimir() {
        System.out.println("Peluche #" + id);
        System.out.println("Material Exterior: " + materialExterior);
        System.out.println("Relleno: " + relleno);
        System.out.println("Color: " + color);
    }
}
