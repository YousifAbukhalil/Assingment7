public class BSTTest {
    public static void main(String[] args) {
        // Creating an instance of BinarySearchTree
        BinarySearchTree bst = new BinarySearchTree();

        // Inserting elements into the tree
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);

        // Performing in-order traversal
        System.out.print("In-Order Traversal: ");
        bst.inOrderTraversal();
        System.out.println();

        // Performing pre-order traversal
        System.out.print("Pre-Order Traversal: ");
        bst.preOrderTraversal();
        System.out.println();

        // Performing post-order traversal
        System.out.print("Post-Order Traversal: ");
        bst.postOrderTraversal();
        System.out.println();

        // Searching for an element
        int searchData = 30;
        System.out.println("Is " + searchData + " present in the tree? " + bst.search(searchData));

        // Checking if the tree is empty
        System.out.println("Is the tree empty? " + bst.isEmpty());

        // Getting the size of the tree
        System.out.println("Size of the tree: " + bst.size());

        // Getting the height of the tree
        System.out.println("Height of the tree: " + bst.height());
    }
}
