import java.util.Scanner;

public class array2 {
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
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int min,max;
        min = max = arr[0];
        for(int i = 0;i<size;i++)
        {
            if(arr[i]<min)
            {
                min = arr[i];
            }
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println("The minimum element of the array is: " + min);
        System.out.println("The maximum element of the array is: " + max);

        //reverse the array use 2 pointers
        int start = 0;
        int end = size-1;
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("The reversed array is: "); //horizontal
        for(int i = 0;i<size;i++)
        {
            System.out.print(arr[i] + " ");
        }

        //find the duplicate element in the array
        System.out.println();
        for(int i = 0;i<size;i++)
        {
            for(int j = i+1;j<size;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("The duplicate element is: " + arr[i]);
                }
            }
        }

    }
    
}
