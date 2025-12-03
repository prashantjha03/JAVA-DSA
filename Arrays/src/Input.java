import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            arr[i] = scanner.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();
        System.out.println(Arrays.toString(arr)+ " ");

        System.out.println(" ");

        String[] str = new String[5];
        for(int i=0; i<str.length; i++){
           str[i] = scanner.next();
        }

        System.out.println(Arrays.toString(str)+" ");

    }


}
