public class main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree<>();
        tree.add(10, 10);
        tree.add(7, 7);
        tree.add(15, 15);
        tree.add(13, 13);
        tree.add(20, 20);
        tree.add(9, 9);
        tree.add(17, 17);
        tree.add(4, 4);
        tree.add(8, 8);
        tree.add(1, 1);
        tree.add(6, 6);
        tree.add(5, 5);
        tree.Postorder(tree.first);
    }
}