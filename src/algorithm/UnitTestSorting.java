package algorithm;

import org.junit.Assert;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
    public static void main(String[] args) {
        int [] sortedArray =   {0,1,2,4,5,6,9};
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] unSortedArray2 = {6,9,2,5,1,0,4};
        int [] unSortedArray3 = {6,9,2,5,1,0,4};
        int [] unSortedArray4 = {6,9,2,5,1,0,4};
        int [] unSortedArray5 = {6,9,2,5,1,0,4};
        int [] unSortedArray6 = {6,9,2,5,1,0,4};

        //Create Sort object
        Sort sort = new Sort();

        //verify if the unsorted array is sorted by the selection sort algorithm.
       try {
            Assert.assertArrayEquals(sortedArray,sort.selectionSort(unSortedArray));
        }catch(Exception ex){
            ex.getMessage();
        }

        //test insertion sort
        try {
            Assert.assertArrayEquals(sortedArray,sort.insertionSort(unSortedArray2));
        }catch(Exception ex){
            ex.getMessage();
        }


        //test quick sort
        try {
            Assert.assertArrayEquals(sortedArray,sort.quickSort(unSortedArray3,0,unSortedArray3.length-1));
        }catch(Exception ex){
            ex.getMessage();
        }

        //test shell sort
        try {
            Assert.assertArrayEquals(sortedArray,sort.shellSort(unSortedArray4));
        }catch(Exception ex){
            ex.getMessage();
        }

        //test merge sort
        try {
            Assert.assertArrayEquals(sortedArray,sort.mergeSort(unSortedArray5,0,unSortedArray5.length-1,unSortedArray5.length));
        }catch(Exception ex){
            ex.getMessage();
        }

        //test heap sort
        try {
            Assert.assertArrayEquals(sortedArray,sort.heapSort(unSortedArray6));
        }catch(Exception ex){
            ex.getMessage();
        }


        //Now implement Unit test for rest of the soring algorithm...................below





    }
}
