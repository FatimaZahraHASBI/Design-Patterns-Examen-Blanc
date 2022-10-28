import CompositePattern.Cercle;
import CompositePattern.Figure;
import CompositePattern.Groupe;
import CompositePattern.Rectangle;
import StrategyPattern.Traitement;
import StrategyPattern.TraitementImpl1;
import StrategyPattern.TraitementImpl2;

public class Application {
    public static void main(String[] args) {
        Dessin dessin = new Dessin();
        Groupe groupe1 = new Groupe();
        Rectangle rectangle1 = new Rectangle(1, 10, 11, 4, 5);
        Rectangle rectangle2 = new Rectangle(1, 2, 2, 5, 6);
        Cercle cercle1 = new Cercle(2, 2, 2, 4);
        Cercle cercle2 = new Cercle(3, 3, 4, 3);

        groupe1.addFigure(rectangle2);
        groupe1.addFigure(cercle2);

        dessin.addFigure(rectangle1);
        dessin.addFigure(cercle1);
        dessin.addFigure(groupe1);

        Traitement traitement = new TraitementImpl1();
        dessin.setTraitement(traitement);

        dessin.traiter();
        Traitement traitement2 = new TraitementImpl2();
        dessin.setTraitement(traitement2);
        dessin.traiter();

        System.out.println("____________________ Le dessin ______________________");
        dessin.showAll();

    }
}
