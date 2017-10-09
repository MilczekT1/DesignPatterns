package observer;

interface PrettyWoman {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void showToAllObservers();
}
