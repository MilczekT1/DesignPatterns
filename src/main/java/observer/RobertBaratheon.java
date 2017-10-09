package observer;

class RobertBaratheon implements Observer{
    private String cerceisHair;
    
    public RobertBaratheon(){}
    
    public void showStatus() {
        System.out.println("    Robert Baratheon see that Cersei has a "  + cerceisHair);
    }
    
    public void update(String hair) {
        this.cerceisHair = hair;
    }
    
}
