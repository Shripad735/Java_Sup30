import java.util.TreeSet;
import java.util.HashMap;
import java.util.HashSet;

public class get_unique {
    public static void main(String[] args) {
        int data[] = {22,233,55,33,33,55,66,77,88,99,99,23,65,21,35};
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
        System.out.println("Unique elements are: ");
        for (int x : set) {
            System.out.print(x + " ");
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        //add all elements from data array to map with count as value 
        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                map.put(data[i], map.get(data[i]) + 1);
            } else {
                map.put(data[i], 1);
            }
        }
        System.out.println("\nall elements with count: ");

        for (int x : map.keySet()) {
            System.out.println(x + " : " + map.get(x));
        }
    }
    
}
