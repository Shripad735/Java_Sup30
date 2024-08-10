public class PatternMix {
    public static void main(String[] args) {
        char a, b;
        int space;
        for (space = 5, a = 'A', b = '1'; space >= 1; space--, a++, b++) {
            for (int s = 1; s <= space; s++) {
                System.out.print(" ");
            }
            for (char j = 'A'; j <= a; j++) {
                System.out.print(j);
            }
            for (char k = '1'; k <= b; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}