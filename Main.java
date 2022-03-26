//NODE
class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}


//LEAF
class BinaryTree {
    // akar
    Node root;
    BinaryTree() { root = null; }

    //postorder
    void printPostorder(Node node)
    {
        if (node == null)
            return;

        // daun kiri
        printPostorder(node.left);

        // daun kanan
        printPostorder(node.right);

        
        System.out.print(node.key + " ");
    }

    //inorder
    void printInorder(Node node)
    {
        if (node == null)
            return;

        //daun kiri
        printInorder(node.left);

        //cetak node
        System.out.print(node.key + " ");

        //daun kanan
        printInorder(node.right);
    }

    //preorder
    void printPreorder(Node node)
    {
        if (node == null)
            return;

        //cetak data awal
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    
    void printPostorder() { printPostorder(root); }
    void printInorder() { printInorder(root); }
    void printPreorder() { printPreorder(root); }
}

//BINARY TRAVERSAL
public class Main{
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(15);
        tree.root.right = new Node(18);
        tree.root.left.left = new Node(12);
        tree.root.left.right = new Node(13);
        tree.root.right.left = new Node(14);
        tree.root.right.right = new Node(19);

        System.out.print(
            "Pre-Order  : ");
        tree.printPreorder();

        System.out.print(
            "\nin-Order   : ");
        tree.printInorder();

        System.out.print(
            "\nPost-Order : ");
        tree.printPostorder();
    }
}
    
