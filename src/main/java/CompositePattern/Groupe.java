package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Groupe extends Figure {
    List<Figure> figures = new ArrayList<>();

    @Override
    public double perimetre() {
        double p = 0;
        for (Figure figure: figures){
            if(figure instanceof  Groupe)
                perimetre();
            else
                p+=figure.perimetre();
        }
        return p;
    }

    @Override
    public double surface() {
        double s = 0;
        for (Figure figure: figures){
            if(figure instanceof  Groupe)
                surface();
            else
                s+=figure.perimetre();
        }
        return s;
    }

    @Override
    public void dessiner(){
        for (Figure figure: figures) {
            if(figure instanceof  Groupe)
                dessiner();
            else
                figure.dessiner();
        }
    }

    public void addFigure(Figure figure){
        this.figures.add(figure);
    }

    public void removeFigure(Figure figure){
        this.figures.remove(figure);
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}
