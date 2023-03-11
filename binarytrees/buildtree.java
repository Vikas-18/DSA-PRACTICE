
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


public class buildtree {
    public static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
        static int idx =-1;
        public static Node buildTree(int[] arr)
        {
            idx++;
            if(arr[idx]==-1)
            {
                return null;
            }

            Node newNode = new Node(arr[idx]);
            newNode.left = buildTree(arr);
            newNode.right = buildTree(arr);

            return newNode;
        }
    
    public static void preOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void levelOrder(Node root)
    {
        if(root==null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data);
                if(currNode.left!=null)
                {
                   q.add(currNode.left);
                }
                if(currNode.right!=null)
                {
                    q.add(currNode.right);
                }
            }
        }
    }
    public static class Info
    {
        Node node;
        int hd;
        public Info(Node node,int hd)
        {
            this.node = node;
            this.hd = hd;
        }
    }
    public static void topView(Node root)
    {
        //store horizantal distance and print only those which occurs for the first time
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        q.add(new Info(root,0));
        int min = 0,max=0;


        while(!q.isEmpty())
        {
            Info currNode = q.remove();

            if(!map.containsKey(currNode.hd))
            {
                map.put(currNode.hd, currNode.node);
            }

            if(currNode.node.left!=null)
            {
                q.add(new Info(currNode.node.left,currNode.hd-1));
                min = Math.min(min,currNode.hd-1);
            }
            if(currNode.node.right!=null)
            {
               q.add(new Info(currNode.node.right,currNode.hd+1));
                max = Math.max(max,currNode.hd+1);
            }
        }
        for (int i = min; i <=max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        boolean path_1 = getPath(root,p,path1);
        boolean path_2 = getPath(root,q,path2);

        int i=0;
        int j=0;
        Node ans = null;
        while(i<path1.size() && j<path2.size())
        {
            if(path1.get(i).data!=path2.get(j).data)
            {
                break;
            }
            else
            {
               ans = path1.get(i);
            }
            i++;
            j++;
        }
        return ans;
    }

    public static boolean getPath(Node root,Node x,ArrayList<Node> list)
    {
        if(root==null)
        {
            return false;
        }
        list.add(root);

        if(root.data==x.data)
        {
            return true;
        }

        boolean foundRight = getPath(root.right,x,list);
        boolean foundLeft = getPath(root.left,x,list);

        if(foundRight || foundLeft)
        {
            return true;
        }

        list.remove(list.size()-1);
        return false;


    }
    public static Node lowestCommonAncestor2(Node root, Node p, Node q) {
        if(root==null || root.data==p.data || root.data==q.data)
        {
            return root;
        }

        Node rightLca = lowestCommonAncestor2(root.right,p,q);
        Node leftLca = lowestCommonAncestor2(root.left,p,q);

        if(rightLca==null)
        {
            return leftLca;
        }
        if(leftLca==null)
        {
            return rightLca;
        }
        return root;
        
    }
    public static void main(String[] args) {
        /*
        *    1
        *   / \
        *  2   3
        * /     \
        *4       6
         */
        int[]arr= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = buildTree(arr);
        // System.out.println(root.data);
        // preOrder(root);
        // levelOrder(root);
        // topView(root);
       Node ans =  lowestCommonAncestor(root, root.left.left, root.right.right);
       System.out.println(ans.data);
    }
}
