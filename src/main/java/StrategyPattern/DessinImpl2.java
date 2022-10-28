package StrategyPattern;

import CompositePattern.Figure;

import java.util.List;

public class DessinImpl2 implements Dessin {
    @Override
    public void traiter(List<Figure> figures) {
        System.out.println("************************");
        System.out.println("Traitement 2 du dessin");
        System.out.println("************************");
    }
}
