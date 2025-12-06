import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
//        intitalize the array with value
        int[] arr = {1, 3, 5, 9, 55, 29};

//        Calling reverse function
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

//    Function to handle Reverse of Array
    static void reverse(int[] arr){
        int start =0;
        int end =arr.length-1;

        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }


    //      Function created to handle swap
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;


    }
}
