package CustomLL;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertEnd(9);
//        list.insertEnd(1);
//        list.insertEnd(3);
//        list.insertEnd(2);
//        list.insertEnd(6);
//        list.display();
//        list.insert_recursion(0, list.size());
//        list.display();

        ListNode head = new ListNode(0);
        ListNode temp = head;
        for (int i = 1; i < 5; i++) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
//        System.out.println(hasCycle(head));

        head = reverseList(head);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null, next=null;
        while(head!=null)
        {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return head;
    }

    static public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        while (prev != null) {
            while (curr != null) {
                if (curr == prev) {
                    return true;
                }
                curr = curr.next;
            }
            prev = prev.next;
            if(prev!=null)
            {
                curr = prev.next;
            }

        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
