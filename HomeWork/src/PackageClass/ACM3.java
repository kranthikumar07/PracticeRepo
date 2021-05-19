package PackageClass;

import PackageVariable.ACM1;

public class ACM3 {
    public static void main(String[] args) {
        ACM1 obj = new ACM1();
        //obj.add1(); //cannot access because its default
        obj.add2();   //public
        //obj.add3();   //Private


        }

}
