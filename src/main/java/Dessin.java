import CompositePattern.Figure;
import StrategyPattern.Traitement;
import StrategyPattern.TraitementImpl1;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    private List<Figure> listFigures = new ArrayList<>();
    private Traitement traitement;

    public Dessin(){}

    public void traiter(){
        traitement.traiter(listFigures);
    }
    public void showAll(){
        for (Figure figure: listFigures)
            figure.dessiner();
    }
    public void addFigure(Figure figure){
        listFigures.add(figure);
    }
    public void removeFigure(Figure figure){
        listFigures.remove(figure);
    }

    public void setTraitement(Traitement traitement) {
        this.traitement = traitement;
    }
}
