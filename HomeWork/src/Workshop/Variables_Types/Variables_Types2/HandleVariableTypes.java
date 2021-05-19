package Workshop.Variables_Types.Variables_Types2;

import Workshop.Variables_Types.Variables_Types1.HandleVariableTypes_Global;
import Workshop.Variables_Types.Variables_Types1.HandleVariableTypes_Local;
import Workshop.Variables_Types.Variables_Types1.HandleVariableTypes_Static;

public class HandleVariableTypes {
    public static void main(String[] args) {

        HandleVariableTypes_Local obj1 = new HandleVariableTypes_Local();
        //System.out.println(obj1.a);
        HandleVariableTypes_Global obj2 = new HandleVariableTypes_Global();
        System.out.println(obj2.a);

        HandleVariableTypes_Static obj3 = new HandleVariableTypes_Static();
        //System.out.println(obj2.a);

    }


}
