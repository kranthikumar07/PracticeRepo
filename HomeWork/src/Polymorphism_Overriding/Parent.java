package Polymorphism_Overriding;

public class Parent {
    public void shapes(int x, int y , int z){

        int num = x+y+z;
        System.out.println(num);
    }
    public void shapes(){
        System.out.println("No value");

    }
    public void shapes(int a, int b, int c, int d ){

        int num1 = a+b+c+d;
        System.out.println(num1);
    }

    }

