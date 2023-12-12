from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def initialize_linked_list(values):
    # Create the head of the linked list
    head = ListNode(values[0])
    current = head

    # Iterate through the values and create nodes for each element
    for value in values[1:]:
        current.next = ListNode(value)
        current = current.next

    return head
values = [1, 2, 3, 4, 5]
def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head.next == None:
            return None
        fast = slow = head
        for i in range(0,n):
            fast = fast.next
        if not fast:
            return head.next
        while fast.next is not None:
            fast = fast.next
            slow=slow.next
        slow.next = slow.next.next
        return head
head = initialize_linked_list(values)
head = removeNthFromEnd(ListNode,head,2)
