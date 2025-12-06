public class MaxValue {
    public static void main(String[] args) {

        //        intitalize the array with value
        int[] arr = {1, 3, 5, 9, 55, 29};

        System.out.println(max(arr));
    }

//    function to get the max value
    static int max(int[] arr){
        int maxVal = arr[0];
        for (int i=0; i<arr.length;  i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
