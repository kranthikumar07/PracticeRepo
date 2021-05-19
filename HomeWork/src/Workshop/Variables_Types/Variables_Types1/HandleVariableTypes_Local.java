package Workshop.Variables_Types.Variables_Types1;

public class HandleVariableTypes_Local {
    int a = 20;

    //System.out.println(a);				//Error for outside main method

    public static void main(String[] args)

    {										//Main method starts

        //System.out.println(a);				//Error as to access it from outside main method

        int b = 10;								//Local variable on main method level

        System.out.println(b);

        //If block
        int c = 100; int d = 50;
        if(c>d)

        {										//If block starts

            System.out.println("Pass");				//Local variable on if block level

            //System.out.println(a);     			//Not allowed as a is declared before main method

            int e = 20;

        }										//If block ends


        //System.out.println(e);				//Error	for outside if block

    }										//Main method ends

    // System.out.println(b);				//Error for outside main method

}
