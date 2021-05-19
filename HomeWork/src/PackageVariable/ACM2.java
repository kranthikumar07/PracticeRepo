package PackageVariable;

public class ACM2 {
    public static void main(String[] args) {

        ACM1 obj1 = new ACM1();
        obj1.add1();  //default
        obj1.add2();  //public
        // System.out.println(obj1.c); //Cannot access 'c' 'because its private variable
        //obj1.add3();  //Cannot access 'add3' method because its private
    }
}