package CustomLL;

public class LC21 {
    public static void main(String[] args) {
        ListNode head = new ListNode(9);
        ListNode temp = head;
        for(int i = 8 ; i>=0 ; i++)
        {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        ListNode ans = reverseBetween(head, 1, 2);
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(right==left)
        {
            return head;
        }
        ListNode left_node = getNode(head,left);
        ListNode right_node = getNode(head,right);
        while(left_node.val<right_node.val)
        {
            //Swap the values of left and right
            int t = left_node.val;
            left_node.val = right_node.val;
            right_node.val = t;
            //Terminating condition
            if(left_node.next == right_node)
            {
                break;
            }
            //change right
            ListNode temp = left_node;
            while(temp.next != right_node)
            {
                temp = temp.next;
            }
            right_node = temp;
            //change left
            left_node=left_node.next;
            display(head);
        }
        return head;
    }

    static ListNode getNode(ListNode head, int index)
    {
        ListNode temp = head;
        for(int i = 2 ; i<=index; i++)
        {
            temp = temp.next;
        }
        return temp;
    }
    static void display(ListNode temp)
    {
        while(temp!=null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
