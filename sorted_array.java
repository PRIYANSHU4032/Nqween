public class sorted_array {
    public static boolean isSorted(int arr[],int i){
        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4};
        isSorted(array, 0);
        
    }
}
