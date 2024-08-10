public class array4 {
    public static void main(String[] args) {
        //create other array , copy elements to array if not already in it
        int[] arr1 = {1,3,4,5,6,5,1,3,2,4,6,2};
        int n = arr1.length;
        int[] arr2 = new int[n];
        int k = 0;
        for(int i = 0;i<n;i++)
        {
            int j;
            for(j = 0;j<i;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    break;
                }
            }
            if(i==j)
            {
                arr2[k++] = arr1[i];
            }
        }
    }
    
}
