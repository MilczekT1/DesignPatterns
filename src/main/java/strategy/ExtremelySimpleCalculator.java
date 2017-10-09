package strategy;

public class ExtremelySimpleCalculator {
    /*----------------------*/
    private Adder adder;
    /*----------------------*/
    
    
    private Double number;
    
    public void setAdder(Adder adder) {
        this.adder = adder;
    }
    
    public static void main(String[] args) {
        ExtremelySimpleCalculator calculator = new ExtremelySimpleCalculator();
        calculator.setNumber(2.5);
        System.out.println("base number is " + calculator.getNumber());
        System.out.println("Calculator now adds 1.0 to number using method add()");
        calculator.setAdder(new ImAdding1());
        calculator.add();
        System.out.println("First call add(): " + calculator.getNumber());
        
        System.out.println("Changing algorithm, add() adds 2 to this number");
        calculator.setAdder(new ImAdding2());
        calculator.add();
        System.out.println("After second call add(): " + calculator.getNumber());
    }
    
    
    public void add(){
        setNumber(adder.add(number));
    }
    
    public double getNumber() {
        return number;
    }
    
    public void setNumber(double number) {
        this.number = number;
    }
}
