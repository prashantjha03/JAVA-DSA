public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {10,20,30,80,2,90,25,36,45,98,95,35};

        System.out.println(minimumNumber(arr));
    }

    static int minimumNumber(int[] arr){
        int minimum = arr[0];
            if(arr.length==0){
                return -1;
            }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] < minimum){
                minimum = arr[index];
            }

        }
            System.out.println("Minimum is ");
            return minimum;

    }
}
