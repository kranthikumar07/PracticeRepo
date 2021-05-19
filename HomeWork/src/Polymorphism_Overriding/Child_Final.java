package Polymorphism_Overriding;

public class Child_Final extends Parent_Final{
    public void eat(){
        System.out.println("Human is eating");
    }

    public static void main(String[] args) {
        Child_Final obj1 = new Child_Final();
        obj1.eat();

        Parent_Final obj2 = new Parent_Final();
        obj2.eat();

        //Up-Casting
        Parent_Final obj3 = new Child_Final();
        obj3.eat();

        //Down-casting
        //Child_Final obj4 = new Parent_Final();  //Not possible
    }

}
