import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimenArrayList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//        Initialisation
        for(int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }

//        Add Element to 2D ArrayList
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++){
                list.get(i).add(scanner.nextInt());
            }
        }
//        output
        System.out.print(list+" ");

    }
}
