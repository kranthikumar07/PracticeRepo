package Workshop.Arrays;

public class SingleD_Array {

    public static void main(String[] args) {
        //Using Integer type Array as variable
        int[] arr1 = {10, 20, 30};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[0] + arr1[1] + arr1[2]);

        //Using Integer type Array as object
        int[] arr2 = new int[3];               //Declare & Initialize Array

        arr2[0] = 10;                          //Assign Value1
        arr2[1] = 20;                          //Assign Value2
        arr2[2] = 30;                          //Assign Value3

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        //System.out.println(arr2[3]);            //Error(Array out of bond)

        //Using String type Array as variable
        String[] arr3 = {"India","USA","UK"};

        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);

        //Using String type Array as object
        String[] arr4 = new String[3];
        arr4[0] = "Sun";
        arr4[1] = "Earth";
        arr4[2] = "Moon";

        System.out.println(arr4[0]);
        System.out.println(arr4[1]);
        System.out.println(arr4[2]);

        //Print array length
        String [] country = {"India", "America", "UK"};
        int fullarray = country.length;
        System.out.println(fullarray);

        //Print 1st array element
        String firstarrayelement = country[0];
        System.out.println(firstarrayelement);

        //Print last array element
        String lastarrayelement = country[fullarray-1];
        System.out.println(lastarrayelement);

        //Copy one value from 1 array to another array
        int [] arr6 = {1,2,3,4,5};
        int [] arr7 = {arr6[4]};
        System.out.println(arr7[0]);                          //Output --> 5

        //Change an Array Element
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "ope1";
        System.out.println(cars[0]);
    }

}