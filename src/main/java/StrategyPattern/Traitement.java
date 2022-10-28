package StrategyPattern;

import CompositePattern.Figure;

import java.util.List;

public interface Traitement {
    void traiter(List<Figure> figures);
}
