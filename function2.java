import java.util.Scanner;

public class function2 {
    static public float usd_to_inr(float usd) {
        return (usd * 84.0f);
    }
    static public float inr_to_usd(float inr) {
        return (inr / 84.0f);
    }
    public static void main(String[] args) {
        // let user select the course fees and in inr or usd

        float fees;
        System.out.println("Enter the fees: ");
        Scanner sc = new Scanner(System.in);
        fees = sc.nextFloat();
        System.out.println("Fees is " + fees);
        float inr = usd_to_inr(fees);
        System.out.println("Fees in INR: " + inr);
        float usd = inr_to_usd(fees);
        System.out.println("Fees in USD: $" + usd);
    }
}