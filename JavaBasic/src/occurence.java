public class occurence {
    public static void main(String[] args) {
        int n = 1389534363;
        int occur = 3;
        int count = 0;

        while(n>0){
            int remainder = n % 10; //last digit will store
            if(remainder== 3){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
