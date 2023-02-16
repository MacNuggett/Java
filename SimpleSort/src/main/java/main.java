 class main {
    public static void main(String[] args){
        MyVector A = new MyVector<>(14);
        A.add(1); A.add(5);A.add(8);A.add(4);A.add(3);A.add(9);A.add(2);A.add(7); A.add(3);A.add(8);A.add(3);A.add(6);A.add(1);A.add(0);
        MyVector B = new MyVector<>(14);
        B.add(1); B.add(5);B.add(8);B.add(4);B.add(3);B.add(9);B.add(2);B.add(7); B.add(3);B.add(8);B.add(3);B.add(6);B.add(1);B.add(0);
        Integer [] C = {0, 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 8, 8, 9};
        A.BubbleSort(0,13,1);
        B.BubbleSort(0,13,-1);
        for(int i=0; i<A.size;i++)
            System.out.println(A.array[i]+"/"+B.array[i]);

        System.out.println("//////");
    }
}
