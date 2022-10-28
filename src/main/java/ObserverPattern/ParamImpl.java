package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class ParamImpl implements Parametrage {
    private int contour;
    private int couleurCountour;
    private int couleurRemplissage;
    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(this);
    }

    public void setContour(int contour) {
        this.contour = contour;
        notifyObservers();
    }

    public void setCountourCouleur(int couleur) {
        couleurCountour = couleur;
        notifyObservers();
    }

    public void setCouleurRemplissage(int remplissage) {
        couleurRemplissage = remplissage;
        notifyObservers();
    }

    public int getContour() {
        return contour;
    }

    public int getCouleurContour() {
        return couleurCountour;
    }

    public int getCouleurRemplissage() {
        return couleurRemplissage;
    }

}
