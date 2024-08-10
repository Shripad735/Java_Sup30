public class recursion {

    public static int gcd(int n1, int n2) {
        if (n1%n2 == 0) {
            return n2;
        } else {
            return gcd(n2, n1%n2);
        }
    }
    public static void main(String[] args) {
        System.out.println(gcd(10, 15));
        System.out.println(gcd(12,8));
    }    
}
