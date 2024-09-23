package LeeCode.Hoot100;

import LeeCode.Hoot100.utils.ListNode;

/**
 * 链表
 */
public class AddTwoNodeNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = l1;
        int carry = 0;
        while(l1.next != null && l2.next != null){
            int sum = l1.val + l2.val + carry;
            l1.val = sum % 10;
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        l1.next = l1.next != null ? l1.next : l2.next;
        l2.next = null;
        while (l1 != null){
            int sum = l1.val + carry;
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            l1.val = sum % 10;
            carry = sum / 10;
            if (l1.next == null){
                break;
            }
            l1 = l1.next;
        }
        if (carry > 0){
            l1.next = new  ListNode(1);
        }
        return result;
    }
}
