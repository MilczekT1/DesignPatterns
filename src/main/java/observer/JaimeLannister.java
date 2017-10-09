package observer;

class JaimeLannister implements Observer {
    private String cerceisHair;
    
    public JaimeLannister(){}
    
    public void showStatus() {
        System.out.println("    Jaime Lannister see that Cersei has a " + cerceisHair);
    }
    
    public void update(String hair) {
        this.cerceisHair = hair;
    }
}
