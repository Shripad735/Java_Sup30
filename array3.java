public class array3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1,2,6,4,5};
        int n = arr.length;
        //first unique element
        int count;
        for(int i = 0;i<n;i++)
        {
            count = 0;
            for(int j = 0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.println("First unique element: " + arr[i]);
                break;
            }
        }
    }
    
}
