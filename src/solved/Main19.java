package solved;

import special.ListNode;

public class Main19 {

    public static void main(String[] args) {

        ListNode l5 = new ListNode(5);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);

        ListNode res = removeNthFromEnd(l1, 2);

        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode beforeRemoveNode = null, removeNode = head;

        ListNode currentNode = head;
        int count = n;
        while (currentNode != null) {
            if (count == 0) {
                beforeRemoveNode = removeNode;
                removeNode = removeNode.next;
            } else {
                count--;
            }
            currentNode = currentNode.next;
        }

        if (head == removeNode) return head != null ? head.next : null;
        beforeRemoveNode.next = removeNode.next;
        return head;
    }
}
