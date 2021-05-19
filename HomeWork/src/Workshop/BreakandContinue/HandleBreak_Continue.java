package Workshop.BreakandContinue;

public class HandleBreak_Continue {
    public static void main(String[] args) {
        //Break statements
        for (int i = 0; i <= 10; i++)
        {
            if (i == 6)
            break;
            System.out.println(i);

        }
        System.out.println("Out of break block");

        //Continue Statements
        for(int i = 0;i<=6;i++)
        {
            if(i==4)
                continue;
            System.out.println(i);
        }
        System.out.println("Out of Continue block");
    }
}
