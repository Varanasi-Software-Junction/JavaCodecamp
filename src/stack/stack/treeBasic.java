package stack;

public class treeBasic {
    public static void main(String[] args) {
        int a[]={3,6,8,1,5,9,7};
        TreeNode root=null;
        for(int i=0;i<a.length;i++)
        {addNode(root,a[i]);
        System.out.println(root);
        }
        preorder(root);
        }
    

static void preorder(TreeNode root)
{
    if(root==null)
    return;
    System.out.println(root);
    preorder(root.left);
    preorder(root.right);
}

 static void addNode(TreeNode root,int data)
{
    if (root==null)
    {
        root=new TreeNode( data);
        return;
    }
    if(data<root.data)
    addNode(root.left, data);
    else
    addNode(root.right, data);

}

  static  class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
          this.data=data;
          this.left=null;
          this.right=null;
            
        }
        @Override
        public String toString()
        {
            return "(" + data + ")";
            

        }

    }
}
