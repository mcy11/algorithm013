package pratice;

/**
 * @author yd
 * @version 1.0
 * @date 2020-07-29 17:23
 */
public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    ListNode(int x) { val = x; }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
