public class BinaryTree<T extends Comparable<T>> {

    Node<T> first = null;
    int size = 0;

    public BinaryTree() {
        first = null;
        size = 0;
    }

    public BinaryTree(BinaryTree tree) {
        this.first = tree.first;
        this.size = tree.size;
    }

    private class Node<T> {
        int index;
        T data = null;
        Node<T> left = null;
        Node<T> right = null;
    }


    public void clear() {
        first = null;
        size = 0;
    }

    public boolean IsEmpty() {
        return (first == null);
    }

    public void add(int index, T data) {
        Node<T> newElement = new Node<>();
        newElement.index = index;
        newElement.data = data;

        if (IsEmpty()) {
            first = newElement;
            size++;
        } else
        {
            Node<T> current = first;
            while (current != null) {
                if (index == current.index)
                    return;
                if (index < current.index) {
                    if (current.left != null)
                        current = current.left;
                    else {
                        current.left = newElement;
                        size++;
                        return;
                    }
                } else {
                    if (current.right != null)
                        current = current.right;
                    else {
                        current.right = newElement;
                        size++;
                        return;
                    }
                }
            }
        }
    }

    public int getSize() {
        return size;
    }

    public T SearchByIndex(int myIndex) {
        if (IsEmpty()) {
            return null;
        } else {
            Node<T> current = first;
            while (current != null) {
                if (myIndex == current.index)
                    return current.data;
                else if (myIndex < current.index)
                    current = current.left;
                else
                    current = current.right;
            }
            return current.data;
        }
    }

    public void Postorder(Node current) {
        if (current == null)
            return;

        Postorder(current.left);

        Postorder(current.right);

        System.out.print(current.data + " ");
    }

}
