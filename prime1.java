public class prime1 {
    public static void main(String[] args) {
        for(int i = 2;i<50;i++){
            int num = i;
            int flag = 0;
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(i);
            }
        }
    }
    
}
