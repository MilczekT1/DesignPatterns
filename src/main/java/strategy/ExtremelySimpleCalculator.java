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
        System.out.println(calculator.getNumber());
        
        calculator.setAdder(new ImAdding1());
        calculator.add();
        System.out.println(calculator.getNumber());
        
        calculator.setAdder(new ImAdding2());
        calculator.add();
        System.out.println(calculator.getNumber());
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
