public class SizeMaxSumHeight {
    public static class Node {

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }

    }

    public static void Display(Node root) {
        // if(root.left== null && root.right == null )
        // return;
        // System.out.print(root.val+"->");
        // Display(root.left);
        // Display(root.right);
        if (root == null)
            return;
        System.out.print(root.val);
        if (root.left == null)
            System.out.print("null");
        else
            System.out.print(root.left.val);
        if (root.right == null) {
            System.out.println("null");
        } else
            System.out.print(root.right.val);
        System.out.println();
        Display(root.left);
        Display(root.right);
    }

    public static int size(Node root) {
        if (root == null)
            return 0;
        return size(root.left) + size(root.right) + 1;

    }

    public static int sum(Node root) {
        if (root == null)
            return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    public static int maxValue(Node root){

      return root==null ? Integer.MIN_VALUE : Math.max(root.val, Math.max(maxValue(root.left), maxValue(root.right)));
        
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);

        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.right = e;

        System.out.println(maxValue(root));

    }
}