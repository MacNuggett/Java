import java.util.Arrays;
public class EffectiveSort {
    //QSORT

    private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        T pivot = array[right];
        int i = left-1;
        for (int j = left; j < right; j++){
            if (array[j].compareTo(pivot)<=0){
                i++;
                T temp = array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        T temp = array[i+1];
        array[i+1]=array[right];
        array[right]=temp;

        return i+1;
    }

    public static <T extends Comparable<T>> void Qsort(T[] array, int left, int right){
        if(left<right){
            int partitionId = partition(array, left, right);
            Qsort(array, left, partitionId-1);
            Qsort(array, partitionId+1, right);
        }
    }

    public static <T extends Comparable<T>> void QSort(T[] array) {
        Qsort(array, 0, array.length - 1);
    }

    //HEAPSORT
    public static <T extends Comparable<T>> T[] HeapSort(T arr[]) {
        return HeapSort(arr, 0, arr.length);
    }

    public static <T extends Comparable<T>> T[] HeapSort(T arr[], int left, int right) {
        int n = right - 1;
        for (int i = n / 2; i >= left; i--)
            Heapify(arr, i, n);
        for (int i = n; i >= left; i--) {
            T t = arr[left];
            arr[left] = arr[n];
            arr[n] = t;
            n--;
            Heapify(arr, 0, n);
        }
        return arr;
    }

    private static <T extends Comparable<T>> void Heapify(T arr[], int pos, int size) {
        int a = 2 * pos + 1;
        int b = 2 * pos + 2;
        int largest_el = pos;

        if (a <= size)
            if (arr[a].compareTo(arr[largest_el]) > 0) {
                largest_el = a;
            }
        if (b <= size)
            if (arr[b].compareTo(arr[largest_el]) > 0) {
                largest_el = b;
            }

        if (largest_el != pos) {
            T t = arr[pos];
            arr[pos] = arr[largest_el];
            arr[largest_el] = t;

            Heapify(arr, largest_el, size);
        }
    }

    //MERGE SORT
    public static <T extends Comparable<T>> T[] MergeSort(T[] arr, int left, int right){
        if (right <= left)
            return arr;

        int mid = (left + right) / 2;
        MergeSort(arr, left, mid);
        MergeSort(arr, mid + 1, right);
        return Merge(arr, left, mid, right);
    }

    public static <T extends Comparable<T>> T[] MergeSort(T[] arr){
        return MergeSort(arr, 0, arr.length-1);
    }

    public static <T extends Comparable<T>> T[] Merge(T[] arr, int left, int mid, int right) {
        T leftArray[] = Arrays.copyOfRange(arr, left, mid + 1);
        T rightArray[] = Arrays.copyOfRange(arr, mid + 1, right + 1);

        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = left; i < right + 1; i++) {
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) < 0) {
                    arr[i] = leftArray[leftIndex];
                    leftIndex++;
                } else {
                    arr[i] = rightArray[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < leftArray.length) {
                arr[i] = leftArray[leftIndex];
                leftIndex++;
            } else if (rightIndex < rightArray.length) {
                arr[i] = rightArray[rightIndex];
                rightIndex++;
            }
        }
        return arr;
    }


    public static <T extends Comparable<T>> T MaxFreq(T[] array) {
        int maxFrequent = 0;
        T max = null;
        int k=0;
        for (int i = 0; i < array.length; i++) {
            int frequent = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    frequent++;
                }
                if (frequent > maxFrequent) {
                    maxFrequent = frequent;
                    max = array[i];
                    k++;
                }
            }
        }
        return max;
    }

}
