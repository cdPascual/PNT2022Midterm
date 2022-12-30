package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


    void swap(int[] array, int a, int b){
        int temp;
        temp = array[a];
        array[a]=array[b];
        array[b]=temp;

    }

    public int[] selectionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;

        for(int j=0; j<list.length-1; j++){
            int min = j;
            for(int i=j+1; i<list.length; i++) {
                if (list[i] < list[min])
                    min = i;
            }

            swap(list,min,j);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int i, j;
        for (i = 1; i < list.length; i++)
        {
            j = i;
            while (j > 0 && list[j - 1] > list[j])
            {
                swap(list,j,j-1);
                j--;
            }
        }


        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    swap(list, j, j + 1);
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    void merge(int a[], int lFirst, int lLast, int rFirst, int rLast, int max)
    {
        int save=lFirst;
        int i = lFirst;
        int [] temp= new int[max];

        while (lFirst<=lLast && rFirst<=rLast)
        {
            if(a[lFirst]<a[rFirst])
            {
                temp[i++]=a[lFirst++];
            }
            else
            {
                temp[i++]=a[rFirst++];
            }
        }
        while(lFirst<=lLast)
        {
            temp[i++]=a[lFirst++];
        }
        while(rFirst<=rLast)
        {
            temp[i++]=a[rFirst++];
        }

        for(i=save;i<=rLast;i++)
        {
            a[i]=temp[i];
        }

    }


    public int [] mergeSort(int [] array,int first, int last, int max){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int middle;

        if(first<last)
        {

            middle = (first+last)/2;

            mergeSort(list, first, middle, max);

            mergeSort(list, (middle+1), last, max);

            merge(list, first, middle, (middle+1), last, max);

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    

    public int [] quickSort(int [] array,int left, int right){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int i = left, j = right;
        int pivot = list[(left + right) / 2];

        while (i <= j)
        {
            while (list[i] < pivot)
            {
                i++;
            }
            while (list[j] > pivot)
            {
                j--;
            }
            if (i <= j)
            {
                swap(list, i, j);
                i++;
                j--;
            }
        }

        if (left < j)
        {
            quickSort(list, left, j);
        }
        if (i < right)
        {
            quickSort(list, i, right);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    void heapDown(int a[], int length, int i){
        int left;
        int right;
        int largest;

        largest=i;
        left = (2*i)+1;
        right = (2*i)+2;

        if(left<length && a[left]>a[largest])
            largest=left;
        if(right<length&&a[right]>a[largest])
            largest=right;
        if(largest!=i) {
            swap(a, i, largest);
            heapDown(a, length, largest);
        }

    }
/*    void createMaxHeap(int a[],int top,int bottom)
    {
        if (top!=bottom)
        {
            createMaxHeap(a,top+1,bottom);
        }
        heapDown(a, top, bottom);
    }
*/
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        //int [] list = array;
        //implement here
        for(int i = array.length/2-1;i>=0;i--){
            heapDown(array, array.length,i);
        }
        for(int i= array.length-1;i>=0;i--){
            swap(array,0,i);
            heapDown(array,i,0);
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return array;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here

        

        return list;
    }
    
    public int [] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int gap;
        int i;
        int j;

        for (gap = list.length/2; gap > 0; gap /= 2)
        {
            for (i = gap; i < list.length; i++)
            {
                for (j=i-gap; j>=0 && list[j]>list[j+gap]; j-=gap)
                {
                    swap(list, j, (j+gap));
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
