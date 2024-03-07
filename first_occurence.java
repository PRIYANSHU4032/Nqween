public class first_occurence {
    public static int foccurence(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return foccurence(arr, key, i+1);
    }


    public static void main(String[] args) {
        int arr[] = {4,5,8,9};
        System.out.println(foccurence(arr, 5, 0));
    }
}
