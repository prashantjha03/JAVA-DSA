public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 100;
        System.out.println(findAns(arr,target));


    }

    static int findAns(int[] arr, int target){
    //First find the range
    //first start with the box of size 2
    int start = 0;
    int end = 1;

    while(target > arr[end]){
        int newStart = end + 1;
    // Double the box value
        end = end + ( end - start + 1) * 2;

        /*
        We have use this check just to ensure that  java will not give array index out of bound.
        From the interviewer perspective and on leetCode platform, no need to use this check.
        if (end >= arr.length) {
            end = arr.length - 1;
        }
        */
        start = newStart;

    }
    return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
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
