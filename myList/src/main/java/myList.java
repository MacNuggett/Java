public class myList<T> {

        public myList(){
            head = null;
        }

        public myList(myList list){
            this.head = list.head;
            this.tail = list.tail;
            this.size = list.size;
        }

        private class Node<T> {
            T data;
            Node<T> next;
        }

        public Node<T> head;
        public Node<T> tail;
        public int size;

        public boolean isEmpty(){
            return head == null;
        }

        public void addToEnd (T data) {
            Node<T> newElement = new Node<>();
            newElement.data = data;
            if (isEmpty()){
                head = newElement;
                tail = newElement;
                size++;
            } else {
                tail.next = newElement;
                tail = newElement;
                size++;
            }
        }
        public void addToStart (T data){
            Node<T> newElement = new Node<>();
            newElement.data = data;
            if (isEmpty()){
                head = newElement;
                tail = newElement;
                size++;
            } else {
                newElement.next = head;
                head = newElement;
                size++;
            }
        }

        public int size(){
            return size;
        }

        public void clean(){
            head = null;
            tail = null;
            size = 0;
        }

        public void deleteFromStart(){
            head = head.next;
            size--;
        }

        public void deleteData(T data){
            Node<T> current = head;
            Node<T> temp = head;
            while (current.data != data) {
                temp = current;
                current = current.next;
            }
            temp.next = current.next;
            size--;
        }

        public boolean FindElement(T data){
            boolean existance = false;
            Node<T> current = head;
            while (current != null){
                if (current.data == data){
                    existance = true;
                }
                current = current.next;
            }
            return existance;
        }
    }

