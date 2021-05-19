package Workshop.Variables_Types.Variables_Types1;

public class HandleVariableTypes_Static {
    static int a = 10;

    //System.out.println(a);				//Error for outside main method

    public static void main(String[] args) 	//Main method starts

    {

        System.out.println(a);					//Allowed


        //If block
        int b = 100; int c = 50;
        if(b>c)
        {										//If block starts

            System.out.println(a);					//Allowed
        }										//If block ends

    }										//Main method ends

}
