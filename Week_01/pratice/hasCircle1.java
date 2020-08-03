package pratice;

/**
 * @author yd
 * @version 1.0
 * @date 2020-07-29 17:39
 */
public class hasCircle1 {

    public boolean hasCycle(ListNode head) {
        ListNode low = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            if(fast == low){
                return true;
            }
            fast = fast.next.next;
            low = low.next;
        }
        return false;
    }
}
