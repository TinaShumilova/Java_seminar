
public class ComplexNumbers {
    private double x;
    private double y;

    public ComplexNumbers(double x, double y){
        this.x = x;
        this.y = y; 
    }

    public ComplexNumbers(double x) {
        this(x, 0);
    }

    public ComplexNumbers() {
        this(0);
    }

    public double PutX(double a){
        return this.x = a;
    }

    public double PutY(double b){
        return this.y = b;
    }

    public double GetX(){
        return x;
    }
    
    public double GetY(){
        return y;
    }
    
}
