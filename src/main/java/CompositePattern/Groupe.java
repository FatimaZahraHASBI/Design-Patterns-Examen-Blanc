package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure {
    List<Figure> figures = new ArrayList<>();

    @Override
    public double perimetre() {
        double p = 0;
        for (Figure figure: figures){
            p+=figure.perimetre();
        }
        return p;
    }

    @Override
    public double surface() {
        double s = 0;
        for (Figure figure: figures){
            s+=figure.perimetre();
        }
        return s;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}
