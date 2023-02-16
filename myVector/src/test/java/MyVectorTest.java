import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class MyVectorTest {

    @Test
    void MyVectorEmpty(){
        MyVector A = new MyVector<>();
        assertEquals(A.size, 0);
        assertEquals(A.max_size, 10);
        Object B[] = {null, null, null, null, null, null, null, null, null, null};
        assertArrayEquals(A.array, B);
    }

    @Test
    void MyVector(){
        MyVector A = new MyVector<>(5);
        Object B[] = {null, null, null, null, null};
        assertArrayEquals(A.array, B);
    }

    @Test
    void MyVectorCopy(){
        MyVector A = new MyVector();
        A.add(3);
        A.add(1);
        A.add(2);
        A.add(5);
        A.add(4);
        MyVector B = new MyVector(A);
        assertArrayEquals(A.array, B.array);
        assertEquals(A.size, B.size);
        assertEquals(A.max_size, B.max_size);
    }

    @Test
    void add() {
        MyVector array = new MyVector();
        array.add(1);
        array.add(3);
        assertEquals(array.size(), 2);
    }

    @Test
    void deleteLast() {
        MyVector array = new MyVector();
        array.add(1);
        array.add(3);
        array.deleteLast();
        assertEquals(array.size(), 1);
    }

    @Test
    void delete() {
        MyVector array = new MyVector();
        array.add(1);
        array.add(2);
        array.add(3);
        array.delete(2);
        assertEquals(array.size(), 2);
    }

    @Test
    void insert() {
        MyVector array = new MyVector();
        array.add(1);
        array.add(2);
        array.insert(0,3);
        assertEquals(array.size(), 3);
    }

    @Test
    void changeSize() {
        MyVector array = new MyVector();
        array.changeSize(25);
        assertEquals(array.max_size(), 25);
    }

    @Test
    void clear() {
        MyVector array = new MyVector();
        array.add(1);
        array.add(2);
        array.add(3);
        array.clear();
        assertEquals(array.size(), 0);
    }

    @Test
    void size() {
        MyVector array = new MyVector();
        array.add(1);
        array.add(2);
        array.add(3);
        assertEquals(array.size(), 3);
    }

    @Test
    void max_size() {
        MyVector array = new MyVector();
        assertEquals(array.max_size(), 10);
    }
}