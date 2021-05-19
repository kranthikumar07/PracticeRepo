package Workshop.SwitchCaseStatement;

public class HandleSwitchCase {
    public static void main(String[] args) {
        //Scenario 1 = Integer
        int marks = 10;
        switch (marks){
            case 35:
                System.out.println("Average");
                break;
            case 50:
                System.out.println("good");
                break;
            case 75:
                System.out.println("Very good");
                break;
            case 100:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Marks not applicable");
        }

        //Scenario 2 = char
        char grade = 'd';
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Average");
                break;
            case 'C':
                System.out.println("Poor");
                break;
            default:
                System.out.println("No grade");
        }

        //Scenario 3 = String
        String week = "abc";
        switch (week){
            case "Mon":
                System.out.println("Today is monday");
                break;
            case "Tues":
                System.out.println("Today is Tuesday");
                break;
            case "Wed":
                System.out.println("Today is Wednesday");
                break;
            default:
                System.out.println("Weekday not applicable");
        }
    }
}
