public class Sorter {

    void merge(int arr[], int l, int m, int r)
    {
        int v1 = m - l + 1;
        int v2 = r - m;


        int left[] = new int [v1];
        int right[] = new int [v2];


        for (int i=0; i < v1; ++i)
            left[i] = arr[l + i];
        for (int j=0; j < v2; ++j)
            right[j] = arr[m + 1+ j];


        int i = 0, j = 0;


        int k = l;
        while (i < v1 && j < v2)
        {
            if (left[i] <= right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else
            {
                arr[k] = right[j];
                j++;
            }
            k++;
        }


        while (i < v1)
        {
            arr[k] = left[i];
            i++;
            k++;
        }


        while (j < v2)
        {
            arr[k] = right[j];
            j++;
            k++;
        }
    }


    void mergesort(int arr[], int l, int r)
    {

        if (l < r)
        {

            int m = (l+r)/2;


            mergesort(arr, l, m);
            mergesort(arr , m+1, r);


            merge(arr, l, m, r);
        }
    }

    //----------------------------------------

    int partition(int arr[], int min, int max)
    {
        int pivot = arr[max];
        int i = (min-1);
        for (int j=min; j<max; j++)
        {

            if (arr[j] < pivot)
            {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i+1];
        arr[i+1] = arr[max];
        arr[max] = temp;

        return i+1;
    }


    void quicksort(int arr[], int min, int max)
    {
        if (min < max)
        {

            int partion_index = partition(arr, min, max);


            quicksort(arr, min, partion_index-1);
            quicksort(arr, partion_index+1, max);
        }
    }


//------------------------------------------


    public void heapsort(int arr[])
    {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n-1; i >= 0; i--)
        {

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }


    void heapify(int arr[], int n, int i)
    {
        int max = i;
        int l = 2*i + 1;
        int r = 2*i + 2;


        if (l < n && arr[l] > arr[max])
            max = l;


        if (r < n && arr[r] > arr[max])
            max = r;


        if (max != i)
        {
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;


            heapify(arr, n, max);
        }
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
/**
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int l = 0;
        int r = arr.length-1;

        //merge sort

        Sorter ob = new Sorter();
        ob.mergesort(arr, l, r);

        System.out.println("\nMargesort array");
        printArray(arr);

        //quick sort

        int arr2[] = {12, 11, 13, 5, 6, 7};

        Sorter ob2 = new Sorter();
        ob2.quicksort(arr2, l, r);

        System.out.println("Quicksort array");
        printArray(arr2);

        //heap sort

        int arr3[] = {12, 11, 13, 5, 6, 7};

        Sorter ob3 = new Sorter();
        ob3.heapsort(arr3);

        System.out.println("Heapsort array");
        printArray(arr3);
    }
 **/

}


