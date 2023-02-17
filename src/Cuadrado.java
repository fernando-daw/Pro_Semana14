public class Cuadrado extends Cuadrilatero implements Forma {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void dibujar_puntos() {
        System.out.println("Has dibujado un Cuadrado");
    }

    @Override
    public void rellenar_puntos() {
        System.out.println("Has rellenado un cuadrado");

    }

    @Override
    public double calcular_area() {
        return this.lado*this.lado;
    }

    @Override
    public double calcular_perimetro() {
        return this.lado*4;
    }
}
