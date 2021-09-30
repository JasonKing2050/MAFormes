public class Cercle extends Forme2D{
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    double aire(){
        return rayon * rayon * Constante.pi;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
