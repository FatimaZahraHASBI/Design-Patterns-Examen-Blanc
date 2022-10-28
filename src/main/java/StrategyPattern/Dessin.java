package StrategyPattern;

import CompositePattern.Figure;

import java.util.List;

public interface Dessin {
    void traiter(List<Figure> figures);
}
