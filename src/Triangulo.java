public class Triangulo extends Trigono implements Forma{
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void dibujar_puntos() {
        System.out.println("has dibujado un rectangulo");

    }

    @Override
    public void rellenar_puntos() {
        System.out.println("has rellenao un triangulo");


    }

    @Override
    public double calcular_area() {
        return ((this.base*this.altura)/2);
    }

    @Override
    public double calcular_perimetro() {
        return this.base*3;
    }
}
