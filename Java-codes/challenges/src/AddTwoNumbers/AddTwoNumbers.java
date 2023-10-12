class AddTwoNumbers {
    /**
    * Definition for singly-linked list.
    */
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    /**
     * Create a new ListNode by adding together the values from two ListNodes
     * @param l1 First ListNode
     * @param l2 Second ListNode
     * @return Computed ListNode
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode current = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int newVal = x + y + carry;
            carry = newVal / 10;
            newVal = newVal % 10;
            
            if (head == null) {
                head = new ListNode(newVal);
                current = head;
            }
            else {
                current.next = new ListNode(newVal);
                current = current.next;
            }

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        if (carry == 1) {
            current.next = new ListNode(1);
        }
        
        return head;
    }

    public static void main(String[] args) {
        // First test
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        System.out.println("");

        // Second test
        l1 = new ListNode(0);
        l2 = new ListNode(0);

        result = addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

        System.out.println("");

        // Third test
        l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        l2 = new ListNode(9, new ListNode(9));

        result = addTwoNumbers(l1, l2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}