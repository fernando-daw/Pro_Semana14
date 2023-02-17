public class Main {
    public static void main(String[] args) {

        Cuadrado cuadradito= new Cuadrado(8);
        Rectangulo rectangulito = new Rectangulo(2,5);
        Triangulo triangulito= new Triangulo(7,10);

        Forma[] formita = new Forma[3];
        formita [0] = cuadradito;
        formita [1] = rectangulito;
        formita [2] = triangulito;

        for (Forma v: formita){
            v.rellenar_puntos();
            v.dibujar_puntos();
            v.calcular_perimetro();
            v.calcular_area();
        }
        
    }
}