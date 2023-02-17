public class Rectangulo extends Cuadrilatero implements Forma {
    private double lado;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double lado, double altura) {
        this.lado = lado;
        this.altura = altura;
    }

    @Override
    public void dibujar_puntos() {
        System.out.println("has dibujado un rectangulo");

    }

    @Override
    public void rellenar_puntos() {
        System.out.println("has rellenado un rectangulo");

    }

    @Override
    public double calcular_area() {
        return this.altura*this.lado;
    }

    @Override
    public double calcular_perimetro() {
        return (this.altura*2)+(this.lado*2);
    }


}

