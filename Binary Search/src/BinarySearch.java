public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-15, -10, -5, -2, -1, 10, 20, 40, 70, 90, 150, 250, 365};
        int target = 20;
        System.out.println(binarySearch(arr,target));


    }

    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length -1;

        while(start<=end){
//            if we use int mid = (start+end)/2, it might be possible that  start+end may exceed the integer value in java
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start = mid+1;
            } else{
                return mid;
            }


        }
        return -1;
    }
}
