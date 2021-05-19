package MathClass;

public class MathClassMethods {

    public void maximum(double x, double y) {
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));

    }
    public void min(int x, int y){
        System.out.println("Minimum number of X and Y is:" + Math.min(x,y));
    }
    public void round(double x){
        System.out.println("Random round value is: "+ Math.round(x));

    }
    public void floor(double x) {
        System.out.println("Random floor value is: " + Math.floor(x));
    }
    public void abs(double x) {
        System.out.println("abs value is: " + Math.abs(x));
    }
    public void squareRoot(double x) {
        System.out.println("Square root of x is: " + Math.sqrt(x));
    }
    public void pow(int x, int y) {
        System.out.println("POW value is: " + Math.pow(x,y));
    }
    public void exp(double x) {
        System.out.println("exp of a is: " + Math.exp(x));
    }
    public void pi() {
        System.out.println("PI: " + Math.PI);
    }

        public static void main(String[] args) {
        MathClassMethods obj = new MathClassMethods();
        obj.maximum(28,4);
        obj.min(10,20);
        obj.round(4.699);
        obj.floor(4.699);
        obj.abs(4.69999);
        obj.squareRoot(4455);
        obj.pow(3,6);
        obj.exp(28);
        obj.pi();

    }
}