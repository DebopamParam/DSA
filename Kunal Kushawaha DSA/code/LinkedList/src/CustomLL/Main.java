package CustomLL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        for (int i = 1; i <= 5; i++) {
            list.insertEnd(i);
        }
        list.display();
        list.insert(11, 5);
        list.display();
        list.insertEnd(19);
        list.display();
        list.remove(0);
        list.display();
        list.remove(list.size() - 1);
        list.display();
        list.remove(2);
        list.display();


    }
}
