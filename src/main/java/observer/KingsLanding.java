package observer;

public class KingsLanding {
    
    public static void main(String[] args) {
        CerseiLannister cersei = new CerseiLannister();
        RobertBaratheon robert = new RobertBaratheon();
        JaimeLannister jaime = new JaimeLannister();
    
        cersei.setHair("Long hair");
        message("Cersei Lannister has got long hair");
        
        cersei.addObserver(jaime);
        message("Jaime has just started watching at her");
        
        cersei.showToAllObservers();
        message("Cersei is uncovering her face!");
        jaime.showStatus();
        
        cersei.addObserver(robert);
        message("Robert Baratheon looks at Cercei but is unable to see her face through her long hair");
        robert.showStatus();
    
        message("Cercei is uncovering her face again!");
        cersei.showToAllObservers();
        jaime.showStatus();
        robert.showStatus();
    
        message("Cersei cut her hair!");
        cersei.setHair("Short hair");
        cersei.showToAllObservers();
    
        jaime.showStatus();
        robert.showStatus();
        
        message("Robert went on hunting! (he is not in room anymore)");
        cersei.removeObserver(robert);
    
        message("Cersei has Long hair Again");
        cersei.setHair("Long hair");
        cersei.showToAllObservers();
    
        jaime.showStatus();
        robert.showStatus();
    }
    public static void message(String message){
        System.out.println("+-----------------------------------------------------------------------------------------+");
        System.out.println("|" + message.toUpperCase());
        System.out.println("+-----------------------------------------------------------------------------------------+");
    }
}
