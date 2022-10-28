package CompositePattern;

public class Cercle extends Figure {
    private int R;

    public Cercle() {
        super();
    }

    public Cercle(int epaisseur, int couleurContour, int couleurRemp, int r) {
        super(epaisseur, couleurContour, couleurRemp);
        R = r;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }

    @Override
    public double perimetre() {
        return 2*R;
    }

    @Override
    public double surface() {
        return R*R*Math.PI;
    }

    @Override
    public void dessiner() {
        System.out.println("Figure : Cercle");
        super.dessiner();
        System.out.println("____Perimetre : "+perimetre());
        System.out.println("____Surface : "+surface());
    }


}
