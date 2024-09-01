import java.util.TreeMap;
import java.util.Scanner;
public class discount_offer {
    public static void main(String[] args) {
        TreeMap<String, Integer> code = new TreeMap<>();
        code.put("CODE1", 10);
        code.put("CODE2", 20);
        code.put("CODE3", 30);
        float ProductPrice = 100;
        String code_given="CODE1";
        System.out.println("Original Price: "+ProductPrice+ " Discounted Price: "+ (ProductPrice-((ProductPrice/100)*code.get(code_given))));

    }
    
}
