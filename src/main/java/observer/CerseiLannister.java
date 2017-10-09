package observer;

import java.util.ArrayList;


class CerseiLannister implements PrettyWoman {
    
    private String hair;
    ArrayList<Observer> observers;
    
    public CerseiLannister(){
        observers = new ArrayList<>();
        setHair("Long hair");
    }
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void showToAllObservers() {
        observers.stream().forEach((o)->o.update(hair));
    }
    
    public String getHair() {
        return hair;
    }
    
    public void setHair(String newHair) {
        this.hair = newHair;
    }
}
