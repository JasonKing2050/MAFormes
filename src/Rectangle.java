public class Rectangle extends Forme2D{
    double hauteur;
    double largeur;

    @Override
    double aire() {
        return hauteur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "hauteur=" + hauteur +
                ", largeur=" + largeur +
                '}';
    }
}
