package Arrays;

public class AveragaNumbers_array {
    public static void main(String[] args) {
        double[] arr = new double[6];
        arr[0] = 23;
        arr[1] = 6;
        arr[2] = 47;
        arr[3] = 35;
        arr[4] = 2;
        arr[5] = 14;

        double total = 0;

        for(int i =0;i<arr.length;i++){

            total = total + arr[i];

        }
        double average = total / arr.length;
        System.out.println("Average of present numbers in array : " + average);

    }
}
