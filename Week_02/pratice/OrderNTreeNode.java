package pratice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mcy
 * @version 1.0
 * @date 2020-08-03 22:00
 */
public class OrderNTreeNode {

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        pre(root, res);
        return res;
    }

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        post(root, res);
        return res;
    }

    public void pre(Node root, List<Integer> res){
        if(root != null){
            res.add(root.val);
            if(root.children != null && root.children.size() != 0){
                for (int i = 0; i < root.children.size(); i++) {
                    pre(root.children.get(i), res);
                }
            }
        }
    }

    public void post(Node root, List<Integer> res){
        if(root != null){
            if(root.children != null && root.children.size() != 0){
                for (int i = 0; i < root.children.size(); i++) {
                    post(root.children.get(i), res);
                }
            }
            res.add(root.val);
        }
    }
}
