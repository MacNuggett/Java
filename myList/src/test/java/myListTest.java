import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myListTest {

    @Test
    void myListEmpty() {
        myList list = new myList();
        assertEquals(list.head, null);
    }

    @Test
    void myList(){
        myList A = new myList();
        A.addToEnd(1);
        A.addToEnd(2);
        A.addToEnd(3);
        myList B = new myList(A);
        assertEquals(A.head, B.head);
        assertEquals(A.tail, B.tail);
        assertEquals(A.size, B.size);
    }

    @Test
    void isEmpty() {
        myList list = new myList();
        assertTrue(list.isEmpty());
    }

    @Test
    void addToEnd() {
        myList list = new myList();
        list.addToEnd(1);
        assertEquals(list.size(), 1);
    }

    @Test
    void addToStart() {
        myList list = new myList();
        list.addToStart(1);
        assertEquals(list.size(), 1);
    }


    @Test
    void size() {
        myList list = new myList();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        assertEquals(list.size(), 3);
    }

    @Test
    void clean() {
        myList list = new myList();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.clean();
        assertTrue(list.isEmpty());
    }

    @Test
    void deleteFromStart() {
        myList list = new myList();
        list.addToEnd(1);
        list.deleteFromStart();
        assertTrue(list.isEmpty());
    }

    @Test
    void deleteData() {
        myList list = new myList();
        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.deleteData(3);
        assertEquals(list.size(), 2);
    }
}