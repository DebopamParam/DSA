package custom_arraylist;

public class CustomArrayList {
    private int[] data;
    private static final int DEFAULT_SIZE = 5;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int item) {
        if (this.isFull()) {
            this.resize();
            data[size++] = item;
        } else {
            data[size++] = item;
        }
    }

    public void resize() {
        int[] temp = new int[size * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i = 0; i < this.size(); i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        list.print();
    }

}
