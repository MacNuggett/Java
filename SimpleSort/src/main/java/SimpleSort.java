import java.util.Arrays;

public class SimpleSort<T>{

    public static <T extends Comparable<T>> T[] BubbleSort (T array[], int left, int right) {
            for (int i = left; i <= right - 1; i++) {
                for (int j = i + 1; j <= right; j++) {
                    if (array[i].compareTo(array[j]) > 0) {
                        T temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }

        return array;
    }

    public static <T extends Comparable<T>> T[] BubbleSort (T array[]) {
        return BubbleSort(array, 0, array.length-1);
    }


    public static <T extends Comparable<T>> T[] InsertionSort(T array[], int left, int right){
        for(int i=left;i<=right;i++)
            for(int j=i; j>left && array[j-1].compareTo(array[j])>0; j--) {
                T temp = array[j-1];
                array[j-1]= array[j];
                array[j] = temp;
            }
        return array;
    }

    public static <T extends Comparable<T>> T[] InsertionSort(T array[]){
        return InsertionSort(array, 0, array.length-1);
    }

    public static <T extends Comparable<T>> T[] SelectionSort(T array[], int left, int right) {
        for (int i=left; i<=right; i++){
            int minPosition = i;
            for (int j=i; j<=right; j++){
                if (array[j].compareTo(array[minPosition])<0)
                    minPosition = j;
            }
            T temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static <T extends Comparable<T>> T[] SelectionSort(T array[]) {
        return SelectionSort(array, 0, array.length-1);
    }


}
