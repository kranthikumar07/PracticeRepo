package Workshop.Loops;

public class ForEachLoop {
    public static void main(String[] args) {
        //Int array
        int[] arr1 = {10,20,30};
        for(int element:arr1){
            System.out.println(element);

            //OR
            //ForLoop
            /*
            for(int i =0;i<arr1.length;i++){
            System.out.println(arr1[i]);
            }
             */
        }
        //String Array
        String[] arr2 = {"alpha","beta","gamma","delta"};
        for(String keyword:arr2){
            System.out.println(keyword);
        }

        //Or
        //ForLoop
        /*
        for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}
		*/
    }

}
