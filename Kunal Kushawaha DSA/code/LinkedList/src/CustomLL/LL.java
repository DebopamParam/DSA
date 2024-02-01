package CustomLL;

import java.util.Objects;

public class LL {
    private Node head;
    private Node tail;
    private int size = 0;

    public int size() {
        return size;
    }

    public void insertFirst(int val) {
        Node temp = new Node(val, head);
        head = temp;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertEnd(int val) {
        if (head == null) {
            insertFirst(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = temp;
        size++;
    }

    private void delete_first()
    {
        System.out.println("Item deleted is " + head.val);
        head = head.next;
        if(head==null)
        {
            tail=null;
        }
        this.size--;
    }

    private void delete_last()
    {
        if(size<=1)
        {
            delete_first();
            return;
        }
        System.out.println("Item deleted is " + tail.val);
        tail = get(size-2);
        tail.next = null;
        this.size--;
    }

    public void remove(int index) {
        Objects.checkIndex(index, size);
        if(index==0)
        {
            delete_first();
            return;
        }
        if(index==this.size-1)
        {
            delete_last();
            return;
        }
        Node prev = this.get(index-1);
        System.out.println("Item deleted is " + prev.next.val);
        prev.next = prev.next.next;
        this.size--;
    }

    public Node get(int index) {
        Objects.checkIndex(index, size);
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insert(int val, int index) {
        Objects.checkIndex(index-1, size);
        if (index == 0) {
            insertFirst(val);
            return;
        }
        try {
            Node curr = head;
            for (int i = 1; i < index; i++) {
                curr = curr.next;
            }
            Node temp = new Node(val, curr.next);
            curr.next = temp;
            if (temp.next == null) {
                tail = temp;
            }
            size++;
        } catch (Exception e) {
            System.out.println("Index out of Bound");
            throw new RuntimeException(e);
        }
    }
    public void insert_recursion(int val, int index)
    {
        head = helper(val,index,head);
    }
    private Node helper(int val, int index, Node node)
    {
        if(index == 0)
        {
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = helper(val,index-1,node.next);
        return node;
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
