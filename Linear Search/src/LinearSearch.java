public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,8,9,85,69,36,58,66,205};
        int target = 599;

        System.out.println(linearSearch(arr, target));

    }

//    search in the array: return the index if item found else return -1
    static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

//        run for loop
        for (int index=0; index<arr.length; index++){
//            check for element at every index if it = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
//        if not any target found then in that case below return will pass -1;
        return -1;
    }
}
