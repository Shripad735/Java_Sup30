import java.util.Scanner;


public class Searching_Main {

    public static int sequentialSearch(int a[], int key) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int key = sc.nextInt();
        int low = 0;
        int high = a.length - 1;
        while(low<=high){
            int mid = (low + high) / 2;
            if(a[mid] == key) {
                return mid;
            } else if(a[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {4,2,6,1,3,5,7};
        int key = 4;
        // int res = sequentialSearch(a, key);
        int res = binarySearch(a);
        if(res == -1) {
            System.out.println(key + " Element not found");
        } else {
            System.out.println("Element found at index: " + res);
        }
        
    }
}
