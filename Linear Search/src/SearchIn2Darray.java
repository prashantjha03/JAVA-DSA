import java.util.Arrays;

public class SearchIn2Darray {
    public static void main(String[] args) {
        int[][] arr= {
                {23, 44, 56},
                {52, 89, 96, 39, 75},
                {2, 9, 24, 42, 68, 33},
                {12, 22}
        };

        int target = 42;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target){


//        loop to find target in 2D array
        for (int row = 0; row < arr.length ; row++) {
            for (int col =0; col< arr[row].length; col++){
                if(arr[row][col]==target){

                    return new int[]{row, col};
                }
            }

        }
        return new int[]{-1, -1};
    }

//    Maximum in 2D Array

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
//        loop to find target in 2D array
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }

        }
        return max;
    }
}
