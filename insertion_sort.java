public class  insertion_sort {
    public static void isort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i+1;
            while(prev >= 0 && arr[prev]> arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = arr[curr];
        }
    }

    public static void printArray(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }


    public static void main(String[] args) {
        int array[] = {5,4,1};
         isort(array);
         printArray(array);
    }
    
}
