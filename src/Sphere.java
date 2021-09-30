public class Sphere extends Forme3D{
    double rayon;
    @Override
    double Volume() {
        return  4 * rayon * rayon * rayon * Constante.pi / 3;

    }

    @Override
    public String toString() {
        return "Sphere{" +
                "rayon=" + rayon +
                '}';
    }
}
