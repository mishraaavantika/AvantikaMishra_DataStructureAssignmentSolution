package ques_2;

public class rightSkewedTreeTraversal {
    static void traversal(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.key + " ");
        traversal(root.right);
    }
}
