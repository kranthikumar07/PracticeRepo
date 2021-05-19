package ConditionalStatements;

public class Compare3_Min {
    public void compare3(int a, int b, int c){
        if(a<b && a<c){
            System.out.println(a+" is Minimum value");
        }
        else if(b<a && b<c){
            System.out.println(b+" is Minimum value");
        }
        else{
            System.out.println(c+" is Minimum value");
        }
    }

    public static void main(String[] args) {
        Compare3_Min obj = new Compare3_Min();
        obj.compare3(10,20,30);
        obj.compare3(50,40,20);
    }
}
