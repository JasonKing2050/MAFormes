public class Principale {
    public static void main(String[] args) {
        Forme2D F2_1 = new Cercle(2.0);
        Forme3D F3_1 = new CylindreDroit(F2_1,3.23);
        Forme3D F3_2 = new Sphere(3.0);

        System.out.println(doubleAFormatSortie2D(F2_1.aire()));
        System.out.println(doubleAFormatSortie3D(F3_1.Volume()));
        System.out.println(doubleAFormatSortie3D(F3_2.Volume()));

    }

    private static String doubleAFormatSortie2D(double montantSansFormat) {
        return String.format("L'aire est de : %.2f m2", montantSansFormat);
    }
    private static String doubleAFormatSortie3D(double montantSansFormat) {
        return String.format("Le volume est de : %.2f m3", montantSansFormat);
    }
}
