public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        if ( data.length == 0 || data == null){
            return ;
        }
        // Add your solution
        int n = data.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (data[j] > data[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
    }



    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

