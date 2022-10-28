package CompositePattern;
public class Rectangle extends Figure {
    private int L;
    private int H;
    public Rectangle(){super();}
    public Rectangle(int epaisseur, int couleurContour, int couleurRemp, int l, int h) {
        super(epaisseur, couleurContour, couleurRemp);
        L = l;
        H = h;
    }
    @Override
    public double perimetre() {
        return 2*(L+H);
    }
    @Override
    public double surface() {
        return L*H;
    }
    @Override
    public void dessiner() {
        System.out.println("Figure : Rectangle");
        super.dessiner();
        System.out.println("____Perimetre : "+perimetre());
        System.out.println("____Surface : "+surface());
    }
    public int getH() {
        return H;
    }
    public int getL() {
        return L;
    }
    public void setH(int h) {
        H = h;
    }
    public void setL(int l) {
        L = l;
    }
}
