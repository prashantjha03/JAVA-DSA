public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,9,74,69,53,65};
        int target =9;
        int start = 2;
        int end = 9;

        System.out.println(searchRange(arr,target,start, end));
    }

    static int searchRange(int[] arr, int target, int start, int end){
        if(arr.length ==0){
            return -1;
        }
        for (int i = start; i < end; i++) {
            int element = arr[i];
            if(element== target){
                System.out.print("Item is at index ");
                return i;

            }
        }
        return -1;
    }
}
