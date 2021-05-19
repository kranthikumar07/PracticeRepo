package Workshop.Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 20,add,sub,mul,div,modulus,increment,decrement;
        add = a+b;
        sub = a-b;
        mul = a*b;
        div = a/b;
        modulus = a%b;
        increment = ++a;   //a = a+1
        decrement = --a;   //a = a-1

        System.out.println("Sum of a and b = " + add);
        System.out.println("Sub of a and b = " + sub);
        System.out.println("Mul of a and b = " + mul);
        System.out.println("div of a and b = " + div);
        System.out.println("Mod of a and b = " + modulus);
        System.out.println("Increment of a  = " + increment);
        System.out.println("Decrement of a  = " + decrement);


    }
}
