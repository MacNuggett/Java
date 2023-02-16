import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EffectiveSortTest {

    @Test
    void Qsort() {
        Integer [] A = {2, 4, -7 ,13, 0, 1, 10, -5, -1, 3, 4, 0, 2, 15};
        EffectiveSort.Qsort(A,0,13);
        Integer [] B = {-7, -5, -1, 0, 0, 1, 2, 2, 3, 4, 4, 10, 13, 15};
        assertArrayEquals(A,B);
    }

    @Test
    void HeapSort() {
        Integer [] A = {2, 4, -7 ,13, 0, 1, 10, -5, -1, 3, 4, 0, 2, 15};
        EffectiveSort.HeapSort(A,0,13);
        Integer [] B = {-7, -5, -1, 0, 0, 1, 2, 2, 3, 4, 4, 10, 13, 15};
        assertArrayEquals(A,B);
    }

    @Test
    void MergeSort() {
        Integer [] A = {2, 4, -7 ,13, 0, 1, 10, -5, -1, 3, 4, 0, 2, 15};
        EffectiveSort.MergeSort(A, 0, 13);
        Integer [] B = {-7, -5, -1, 0, 0, 1, 2, 2, 3, 4, 4, 10, 13, 15};
        assertArrayEquals(A,B);
    }

    @Test
    void MaxFreq() {
        Integer [] A = {2, 4, 5 ,4, 3, 1, 5, 4, 3, 5, 3, 4, 0, 2, 5, 5};
        EffectiveSort.QSort(A);
        assertEquals(EffectiveSort.MaxFreq(A),5);
    }

}