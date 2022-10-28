package ObserverPattern;

public interface Parametrage {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
