
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

//        input
        for(int i=0; i<5; i++){
            list.add(scanner.nextInt());
        }

//        Direct Output

        System.out.println("Direct Output"+list);

//        Loop output
        System.out.println("Output using for loop");
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
        }

    }
}
