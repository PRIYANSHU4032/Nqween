public class last_occerence {
    public static int loccerence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }

        int isfound = loccerence(arr, key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }

        return isfound;
    }

    public static void main(String[] args) {
        int arr[] = {5,8,5,4};
        System.out.println(loccerence(arr, 5, 0));
    }
}
