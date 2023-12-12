package custom_arraylist;

import java.util.Arrays;

public class GenericList<T> {
    final int Initial_SIZE = 10;
    Object[] list = new Object[Initial_SIZE];
    private int size = 0;

    public void append(T item) {
        if (size == list.length) {
            this.resize();
        } else {
            this.list[size++] = item;
        }
    }

    public void remove()
    {
        T item = (T)list[size--];
        System.out.println("Item removed" + item);
    }

    private void resize() {
        int new_size = size * 2;
        Object[] temp = new Object[new_size];
        for (int i = 0; i < this.size; i++) {
            temp[i] = list[i];
        }
        this.list = temp;
    }

    @Override
    public String toString() {
        return "GenericList{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        for (int i = 0; i < 15; i++) {
            list.append(i*2);
        }
        System.out.println(list);
    }
}