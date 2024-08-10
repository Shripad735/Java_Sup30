public class armstrong1 {
    public static void main(String[] args) {
        for(int i = 100;i<1000;i++){
            int num = i;
            int temp = num;
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum += rem * rem * rem;
                num /= 10;
            }
            if (temp == sum) {
                System.out.println(i);
            }
        }
    }
    
}
