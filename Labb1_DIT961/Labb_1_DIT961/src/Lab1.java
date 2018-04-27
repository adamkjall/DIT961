import java.util.Random;

public class Lab1 {
    /**
     * Sorting algorithms
     **/

    public static void main(String[] args) {
        int[] arr1 = {1,3,4};
        int[] arr2 = {};
        quickSort(arr1);
        for (int i : arr1
                ) {
            System.out.print(i + ", ");

        }

    }

    // Insertion sort.

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int nextVal = array[i];
            int currentIndex = i - 1;

            // move elems upwards if current val is greater than next val
            while (currentIndex >= 0 && array[currentIndex] > nextVal) {
                array[currentIndex + 1] = array[currentIndex];
                currentIndex--;
            }
            array[currentIndex + 1] = nextVal;

        }
    }

    // Quicksort.

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    // Quicksort part of an array
    private static void quickSort(int[] array, int begin, int end) {
        if (begin >= end) return;
        // return index of pivot
        int pivot = partition(array, begin, end);
        quickSort(array, begin, pivot - 1);
        quickSort(array, pivot + 1, end);
    }

    // Partition part of an array, and return the index where the pivot
    // ended up.
    private static int partition(int[] array, int begin, int end) {
        //Random r = new Random();
        // Random number between [begin, end]
        //int randomIndex = begin + r.nextInt(end - begin + 1);

        // Put the pivot at the end of list
        //swap(array, randomIndex, end);
        int pivotIndex = begin;
        int pivot = array[begin++];


        while(true){

            while(array[begin] < pivot && begin < end) {
                begin++;

            }

            while(array[end] >= pivot && end >= begin){
                    end --;
            }

            if(begin < end) {
                swap(array, begin, end);
            }
            else break;
        }


        swap(array, end, pivotIndex);
        return end;

    }

    // Swap two elements in an array
    private static void swap(int[] array, int i, int j) {
        int x = array[i];
        array[i] = array[j];
        array[j] = x;
    }

    // Mergesort.

    public static int[] mergeSort(int[] array) {
        return mergeSort(array, 0, array.length - 1);
    }

    // Mergesort part of an array
    private static int[] mergeSort(int[] array, int begin, int end) {
        // If no elements in array
        if(end < 0){
            return array;
        }
        // If only one element in sub array
        if (begin == end) {
            int[] newArr = new int[1];
            newArr[0] = array[begin];
            return newArr;
        }

        int middle = (end - begin) / 2 + begin;
        int arr1[] = mergeSort(array, begin, middle);
        int arr2[] = mergeSort(array, middle + 1, end);
        return merge(arr1, arr2);
    }

    // Merge two sorted arrays into one sorted array
    private static int[] merge(int[] left, int[] right) {
        int[] mergedArr = new int[left.length + right.length];

        for (int l = 0, r = 0, m = 0; m < mergedArr.length; m++) {
            // if both lists have elems left to merge
            if (l < left.length && r < right.length) {
                if (left[l] < right[r]) {
                    mergedArr[m] = left[l];
                    l++;
                } else {
                    mergedArr[m] = right[r];
                    r++;
                }
                // if only one list have elems left to merge
            } else {
                if (l < left.length) {
                    mergedArr[m] = left[l];
                    l++;
                } else {
                    mergedArr[m] = right[r];
                    r++;
                }
            }
        }
        return mergedArr;
    }
}