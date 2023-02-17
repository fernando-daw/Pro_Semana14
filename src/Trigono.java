public abstract class Trigono {
    private Punto[] vertices = new Punto[3];

    public Punto[] getVertices() {
        return this.vertices;
    }

    public void setVertices(Punto[] vertices) {
        this.vertices = vertices;
    }
    public void setVertices(Punto x1,Punto x2,Punto x3) {
        vertices[0]= x1;
        vertices[1]= x2;
        vertices[2]= x3;
    }

}
