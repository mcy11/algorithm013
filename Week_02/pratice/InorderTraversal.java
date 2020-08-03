package pratice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mcy
 * @version 1.0
 * @date 2020-08-03 21:50
 */
public class InorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if(root != null){
            res.add(root.val);
            if(root.left != null){
                preorder(root.left, res);
            }
            if(root.right != null){
                preorder(root.right, res);
            }
        }
    }

    public void inorder(TreeNode root, List<Integer> res){
        if(root != null){
            if(root.left != null){
                inorder(root.left, res);
            }
            res.add(root.val);
            if(root.right != null){
                inorder(root.right, res);
            }
        }
    }
}
