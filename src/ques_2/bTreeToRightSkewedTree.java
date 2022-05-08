package ques_2;

    class Node
    {
        int key;
        Node left, right;

        // function that allocates a new node
        // with the given data and NULL to left and right nodes.
        Node(int data)
        {
            key = data;
            left = right = null;
        }
    }

    class bTreeToRightSkewedTree
    {
        public static Node node;
        static Node prevNode = null;
        static Node headNode = null;

        // Function to convert the binary search tree into a skewed tree in
        // increasing order
        static void BTreeToSkewed(Node root,int order)
        {

            if(root == null)
            {
                return;
            }

            if(order > 0)
            {
                BTreeToSkewed(root.right, order);
            }
            else
            {
                BTreeToSkewed(root.left, order);
            }
            Node rightNode = root.right;
            Node leftNode = root.left;

            // Condition to check if the root Node
            // of the skewed tree is present or not,
            //so to create the root node

            if(headNode == null)
            {
                headNode = root;
                root.left = null;
                prevNode = root;
            }
            else
            {
                prevNode.right = root;
                root.left = null;
                prevNode = root;
            }

            // Similarly recurse for the left / right
            // subtree on the basis of the order required
            if (order > 0)
            {
                BTreeToSkewed(leftNode, order);
            }
            else
            {
                BTreeToSkewed(rightNode, order);
            }
        }


        // Driver Code
        public static void main (String[] args)
        {
            bTreeToRightSkewedTree tree = new bTreeToRightSkewedTree();
            tree.node = new Node(50);
            tree.node.left = new Node(30);
            tree.node.right = new Node(60);
            tree.node.left.left = new Node(10);
            tree.node.right.left = new Node(55);

            // For Increasing order 'order'- 0
            // For Decreasing order 'order'- 1
            int order = 0;
            BTreeToSkewed(node, order);
            rightSkewedTreeTraversal.traversal(headNode);
        }
}
