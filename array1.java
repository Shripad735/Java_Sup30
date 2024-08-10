import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int[] arr;
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0;i<size;i++)
        {
            System.out.print("Enter the element at index " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i = 0;i<size;i++)
        {
            System.out.println("Element at index " + (i+1) + ": " + arr[i]);
        }
    }
    
}
