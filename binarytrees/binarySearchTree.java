public class binarySearchTree {
    public static class Node
    {
        int val;
        Node left;
        Node right;

        Node(int data)
        {
            this.val = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node build(Node root,int val)
    {
        if(root==null)
        {
            root = new Node(val);
            return root;
        }

        if(root.val>val)
        {
            root.left = build(root.left,val);
        }
        else
        {
            root.right = build(root.right,val);
        }
        return root;
    }
    public static void inOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
    public static boolean search(Node root,int val)
    {
        if(root==null)
        {
            return false;
        }
        if(root.val==val)
        {
            return true;
        }
        boolean right = false;
       if(root.val>val)
       {
         right = search(root.right, val);
       }
        boolean left = false;
       if(root.val>val)
       {
         left = search(root.left, val);
       }
 
        return right|left;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2,7};
        Node root = null;
        for (int index = 0; index < arr.length; index++) {
            root = build(root,arr[index]);
        }
        System.out.println(search(root,1));

        inOrder(root);
    }
}
