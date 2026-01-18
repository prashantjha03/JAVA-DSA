public class smallestLetter {
    public static void main(String[] args) {

//leet code
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    }

    static int smallestLetters(int[] letters, int target){

        int start =0;
        int end = letters.length -1;

        while(start<=end){
//            if we use int mid = (start+end)/2, it might be possible that  start+end may exceed the integer value in java
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid-1;
            } else  {
                start = mid+1;
            }


        }
        return letters[start % letters.length] ;
    }
}
