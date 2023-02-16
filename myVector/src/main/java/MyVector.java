import java.util.Arrays;

public class MyVector<T> {
    T[] array;
    int size = 0;
    int max_size;

    public MyVector(){
        size=0;
        max_size = 10;
        array = (T[])new Object[max_size];
    }

    public MyVector(int max_size){
        array = (T[])new Object[max_size];
    }

    public MyVector(MyVector<T> A){
        this.array = Arrays.copyOf(A.array, A.array.length);
        this.size = A.size();
        this.max_size = A.max_size();
    }

    void add(T element){
        if (size == max_size){
            max_size = 2*size+1;
            array = Arrays.copyOf(array, max_size);
        }
        array[size]= element;
        size++;
    }

    void deleteLast(){
        if(array != null){
            array[size - 1] = null;
            size--;
        }
    }

    void delete(int index){
        if(array != null){
            for (int i=index; i<size-1; i++){
                array[i] = array[i+1];
            }
            size--;
        }
    }

    void insert(int index, T element){
        if (size == max_size){
            max_size = 2*size+1;
            array = Arrays.copyOf(array, max_size);
        }
        T[] temp = Arrays.copyOfRange(array, index, size);
        array[index] = element;
        System.arraycopy(temp, 0, array, index+1, temp.length);
        size++;
    }

    void changeSize(int newsize){
        array = Arrays.copyOf(array, newsize);
        max_size = newsize;
    }

    void clear(){
        array = null;
        size=max_size=0;
    }

    int size(){
        return size;
    }

    int max_size(){
        return max_size;
    }

}
