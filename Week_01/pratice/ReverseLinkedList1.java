package pratice;

/**
 * @author yd
 * @version 1.0
 * @date 2020-07-29 17:01
 */
public class ReverseLinkedList1 {

    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
