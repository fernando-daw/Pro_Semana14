public abstract class Cuadrilatero {
    private Punto[] vertices = new Punto[4];



    public Punto[] getVertices() {
        return this.vertices;
    }

    public void setVertices(Punto[] vertices) {
        this.vertices = vertices;
    }
    public void setVertices(Punto x1,Punto x2,Punto x3,Punto x4) {
        vertices[0]= x1;
        vertices[1]= x2;
        vertices[2]= x3;
        vertices[3]= x4;
    }
}
