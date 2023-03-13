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
     public Node sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
    }
    public Node build(int[]nums, int s , int e)
    {
        if(s>e)
        {
            return null;
        }
        int mid = (s + e)/2;

        Node root = new Node(nums[mid]);
        root.left = build(nums,s,mid-1);
        root.right = build(nums,mid+1,e);
        return root;
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

    public boolean isValidBST(Node root) {
        return isValid(root,null,null);
    }
    public boolean isValid(Node root,Node min,Node max)
    {
        if(root==null)
        {
            return true;
        }
        
        if(min!=null && root.val<=min.val)
        {
            return false;
        }
        if(max!=null && root.val>=max.val)
        {
            return false;
        }

        return isValid(root.left,min,root) & isValid(root.right,root,max);
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
