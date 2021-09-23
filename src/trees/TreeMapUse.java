
package trees;

import java.util.TreeMap;

public class TreeMapUse {
    public static void main(String[] args) {
        TreeMap<Integer,TreeNode> map=new TreeMap<>();
        map.put(1, new TreeNode("Sachin"));
        map.put(2, new TreeNode("Rahul"));
        System.out.println(map);
        System.out.println( map.keySet());
        
    }
   static class TreeNode
    {
       int left, right;
       String data;

        public TreeNode(String data) {
            this.data = data;
            this.left=-1;
            this.right=-1;
        }
       
    }
       
    }

