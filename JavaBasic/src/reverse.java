public class reverse {
    public static void main(String[] args) {
        int n = 2589;

        int reverse = 0;

        while(n>0){
            int remainder = n % 10; //last digit
            n /= 10;
            reverse = reverse *10 + remainder;
        }
        System.out.println(reverse);
    }
}
