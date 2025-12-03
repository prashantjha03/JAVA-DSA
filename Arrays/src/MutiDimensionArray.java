import java.util.Arrays;
import java.util.Scanner;

public class MutiDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for(int row=0; row<arr.length; row++ ){
            for(int col=0; col<arr[row].length; col++){
                arr[row][col] = scanner.nextInt();
            }
        }

        for(int row=0; row<arr.length; row++ ){
//            arr[row].length will give exact number of colom in that particular row { {1,2,3}, {4,5}, {6,7,8,9} }like this.
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        System.out.println("array using toString");

        for(int row=0; row<arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println("2D Array print using enhanced for loop for-each");

        for(int[] matrix : arr){
            System.out.println(Arrays.toString(matrix));
        }
    }
}
