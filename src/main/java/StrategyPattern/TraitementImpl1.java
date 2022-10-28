package StrategyPattern;

import CompositePattern.Figure;

import java.util.List;

public class TraitementImpl1 implements Traitement {
    @Override
    public void traiter(List<Figure> figures) {
        System.out.println("-------------------");
        System.out.println("Traitement 1 du dessin");
        System.out.println("-------------------");
    }
}
