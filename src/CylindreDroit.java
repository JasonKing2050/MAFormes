public class CylindreDroit extends Forme3D{
    Forme2D CD2D;
    double hauteur;

    public CylindreDroit(Forme2D CD2D, double hauteur) {
        this.CD2D = CD2D;
        this.hauteur = hauteur;
    }
    @Override
    double Volume(){
        return CD2D.aire() * hauteur;
    }

    @Override
    public String toString() {
        return "CylindreDroit{" +
                "CD2D=" + CD2D +
                ", hauteur=" + hauteur +
                '}';
    }
}
