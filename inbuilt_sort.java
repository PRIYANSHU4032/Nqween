import java.util.Arrays;
import java.util.Collections;

public class inbuilt_sort {


    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }
    

    public static void main(String[] args) {
        int array[] = {5,4,1,3,2};
        
       //int arr[] = new int[array.length];
        Arrays.sort(array);
        printArray(array);
       // Arrays.sort(array,Collections.reverseOrder());
        printArray(array);


   }
}
