package ConditionalStatements;

public class Compare3_Max {
    public void compare3(int a, int b, int c){
        if(a>b && a>c){
            System.out.println(a+" is the Maximum value");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the Maximum value");
        }
        else{
            System.out.println(c+" is the Maximum value");
        }
    }

    public static void main(String[] args) {
        Compare3_Max obj = new Compare3_Max();
        obj.compare3(10,20,30);
        obj.compare3(50,20,10);
    }
}
