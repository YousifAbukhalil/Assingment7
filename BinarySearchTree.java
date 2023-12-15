class BinarySearchTree {
    private static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void delete(int data) {
        root = deleteRec(root, data);
    }

    private Node deleteRec(Node root, int data) {
        // Implementation for deletion (not provided here)
        // You can choose your own method for deletion based on your requirements.
        return root;
    }

    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, int data) {
        if (root == null || root.data == data) {
            return root != null;
        }

        if (data < root.data) {
            return searchRec(root.left, data);
        } else {
            return searchRec(root.right, data);
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int size() {
        return sizeRec(root);
    }

    private int sizeRec(Node root) {
        return root == null ? 0 : 1 + sizeRec(root.left) + sizeRec(root.right);
    }

    public int height() {
        return heightRec(root);
    }

    private int heightRec(Node root) {
        return root == null ? 0 : 1 + Math.max(heightRec(root.left), heightRec(root.right));
    }

    public void inOrderTraversal() {
        inOrderTraversalRec(root);
    }

    private void inOrderTraversalRec(Node root) {
        if (root != null) {
            inOrderTraversalRec(root.left);
            System.out.print(root.data + " ");
            inOrderTraversalRec(root.right);
        }
    }

    public void preOrderTraversal() {
        preOrderTraversalRec(root);
    }

    private void preOrderTraversalRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrderTraversalRec(root.left);
            preOrderTraversalRec(root.right);
        }
    }

    public void postOrderTraversal() {
        postOrderTraversalRec(root);
    }

    private void postOrderTraversalRec(Node root) {
        if (root != null) {
            postOrderTraversalRec(root.left);
            postOrderTraversalRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}
