package pratice;

import java.util.List;

/**
 * @author mcy
 * @version 1.0
 * @date 2020-08-03 22:00
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
