public class sorting_main {

    static void bubble_sort(int a[]){
        for(int i = 0;i<a.length;i++){
        for(int j=0;j<a.length-1;j++)
        {
            if(a[j]>a[j+1])
            {
                int t = a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
    }
    }
    static void selection_sort(int a[]){
        int min = 0,pos = 0;
        for(int i = 0;i<a.length;i++){
        for(int j=0;j<a.length-1;j++)
        {
            min = a[i];
            pos = i;
            if(a[j]<min)
            {
                min = a[j];
                pos = j;
            }
        }
        a[pos]=a[i];
        a[i] = min;
    }
    }

    static void insertion_sort(int a[]){
        int new_element = 0;
        for(int i = 1;i<a.length;i++){
            new_element = a[i+1];
            int j = i+1;
            while(j>0 && a[j-1]>new_element)
            {
                a[j] = a[j-1];
                j = j-1;
            }
            a[j] = new_element;   
        }
    }

    static void quick_sort(int a[],int start,int end)
    {
        int pivot, i, j, temp;
        i = start;
        j = end;
        pivot = start;
        while (i<j)
        {
            while (a[i] < a[pivot])
                i++;
            while (a[j] > a[pivot])
                j--;
            if (i < j)
            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        if(i<end)
            quick_sort(a,i+1,j);
        if(j>start)
            quick_sort(a,i,j-1);
    }

    static void print_Array(int a[])
    {
        for(int i = 0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a[] = {11,33,22,55,44,77,66,99,88};
        System.out.print("Array Before Sorting : ");
        print_Array(a);
        System.out.println();
        bubble_sort(a);
        // System.out.print("Array After Sorting (bubble Sort): ");
        // print_Array(a);
        System.out.println();
        System.out.print("Array after Sorting : ");
        quick_sort(a,0,a.length-1); // quick sort
        print_Array(a);
    }
    
}
