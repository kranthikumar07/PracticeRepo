package Arrays;

public class HighestNumber_array {
    public static void main(String[] args) {
        int[] arr = {23,6,47,35,2,14};
        //Initialize max number
        int max = arr[0];
        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Highest number present in given array : "+ max);

    }
}
