import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleSortTest<T> {

    @Test
    void testBubbleSort() {
        Integer [] A = {1, 5, 8 ,4, 3, 9, 2, 7, 3, 8, 3, 6, 1, 0};
        Integer [] B = {0, 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8, 9};
        Integer [] C = {2, 4, -7, 13, 0, 1, 10, -5, -1, 3, 4, 0, 2, 15};
        Integer [] D = {2, 4, -7, 0, 1, 10, 13, -5, -1, 3, 4, 0, 2, 15};
        SimpleSort.BubbleSort(A);
        SimpleSort.BubbleSort(C,2,6);
        assertArrayEquals(A, B);
        assertArrayEquals(C, D);

        String [] E = {"element4", "element3", "element5", "element1", "element2"};
        String [] F = {"element1", "element2", "element3", "element4", "element5"};
        SimpleSort.BubbleSort(E);
        assertArrayEquals(E, F);
    }

    @Test
    void testInsertionSort() {
        Integer [] A = {1, 5, 8 ,4, 3, 9, 2, 7, 3, 8, 3, 6, 1, 0};
        Integer [] B = {0, 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8, 9};
        Integer [] C = {2, 4, -7, 13, 0, 1, 10, -5, -1, 3, 4, 0, 2, 15};
        Integer [] D = {2, 4, -7, 0, 1, 10, 13, -5, -1, 3, 4, 0, 2, 15};
        SimpleSort.InsertionSort(A);
        SimpleSort.InsertionSort(C,2,6);
        assertArrayEquals(A, B);
        assertArrayEquals(C, D);

        String [] E = {"element4", "element3", "element5", "element1", "element2"};
        String [] F = {"element1", "element2", "element3", "element4", "element5"};
        SimpleSort.InsertionSort(E);
        assertArrayEquals(E, F);
    }

    @Test
    void testSelectionSort() {
        Integer [] A = {1, 5, 8 ,4, 3, 9, 2, 7, 3, 8, 3, 6, 1, 0};
        Integer [] B = {0, 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8, 9};
        Integer [] C = {2, 4, -7, 13, 0, 1, 10, -5, -1, 3, 4, 0, 2, 15};
        Integer [] D = {2, 4, -7, 0, 1, 10, 13, -5, -1, 3, 4, 0, 2, 15};
        SimpleSort.SelectionSort(A);
        SimpleSort.SelectionSort(C,2,6);
        assertArrayEquals(A, B);
        assertArrayEquals(C, D);

        String [] E = {"element4", "element3", "element5", "element1", "element2"};
        String [] F = {"element1", "element2", "element3", "element4", "element5"};
        SimpleSort.SelectionSort(E);
        assertArrayEquals(E, F);
    }

    @Test
    void testBubbleSortKey() {
        MyVector A = new MyVector<>();
        A.add(1); A.add(5);A.add(8);A.add(4);A.add(3);A.add(9);A.add(2);A.add(7); A.add(3);A.add(8);A.add(3);A.add(6);A.add(1);A.add(0);
        MyVector B = new MyVector<>();
        B.add(9); B.add(8);B.add(8);B.add(7);B.add(6);B.add(5);B.add(4);B.add(3); B.add(3);B.add(3);B.add(2);B.add(1);B.add(1);B.add(0);
        MyVector C = new MyVector<>();
        C.add(0);C.add(1);C.add(1);C.add(2);C.add(3);C.add(3);C.add(3); C.add(4);C.add(5);C.add(6);C.add(7);C.add(8); C.add(8);C.add(9);
        Integer [] D = {9, 8, 8, 7, 6, 5, 4, 3, 3, 3, 2, 1, 1, 0};
        A.BubbleSort(0,13,1);
        assertArrayEquals(A.array, C.array);
        A.BubbleSort(0,13,-1);
        assertArrayEquals(A.array, B.array);
    }
}