import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null) return new ArrayList<Integer>();
        LinkedList<TreeNode> temp1 = new LinkedList<>();

        temp1.addLast(root);

        List<Integer> result = new LinkedList<>();
        while (temp1.size() > 0) {
            result.add(temp1.getLast().val);
            LinkedList<TreeNode> temp2 = new LinkedList<>();
            for (TreeNode treeNode : temp1) {
                if (treeNode.left != null) {
                    temp2.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    temp2.addLast(treeNode.right);
                }
            }
            temp1 = temp2;
        }
        return result;
    }
}