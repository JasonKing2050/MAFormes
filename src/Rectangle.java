public class Rectangle extends Forme2D{
    double hauteur;
    double largeur;

    public Rectangle(double hauteur, double largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

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
