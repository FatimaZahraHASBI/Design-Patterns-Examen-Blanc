package CompositePattern;

public abstract class Figure {
    private Point point;
    private int epaisseur;
    private int couleurContour;
    private int couleurRemp;

    public abstract double perimetre();
    public abstract double surface();

    public void dessiner(){
        System.out.println("____Epaisseur : "+getEpaisseur());
        System.out.println("____Couleur Contour : "+getCouleurContour());
        System.out.println("____Couleur Remplissage : "+getCouleurRemp());
    }

    public Figure() {}

    public Figure(int epaisseur, int couleurContour, int couleurRemp) {
        this.epaisseur = epaisseur;
        this.couleurContour = couleurContour;
        this.couleurRemp = couleurRemp;
    }

    public int getCouleurContour() {
        return couleurContour;
    }
    public int getCouleurRemp() {
        return couleurRemp;
    }
    public int getEpaisseur() {
        return epaisseur;
    }
}
