package Workshop.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        //Scenario 1
        int[][] marks = {{40, 50, 60},{70, 80, 90}};
        System.out.println(marks[0][0]);
        System.out.println(marks[0][1]);
        System.out.println(marks[0][2]);

        System.out.println(marks[1][0]);
        System.out.println(marks[1][1]);
        System.out.println(marks[1][2]);

        //Scenario 2
        int x[] = {1,2,3,4};
        int y[] = {5,6,7,8};
        int z[] = {9,10,11,12};

        int arr2 [][] = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12}};

        System.out.println(arr2[0][3]);
        System.out.println(arr2[1][2]);
        System.out.println(arr2[2][0]);




    }
}