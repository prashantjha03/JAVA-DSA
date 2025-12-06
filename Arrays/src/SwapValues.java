import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
//        intitalize the array with value
        int[] arr = {1, 3, 5, 9, 55, 29};

//        calling function swap
        swap(arr,1,5);
        System.out.println(Arrays.toString(arr));
    }
//      Function created to handle swap
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }
}
