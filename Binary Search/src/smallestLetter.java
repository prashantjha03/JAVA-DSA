public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 19;
        System.out.println(ceiling(arr,target));


    }

    static int ceiling(int[] arr, int target){
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
        return start;
    }
}
