import java.util.ArrayList;
import java.util.List;


public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int value){
		this.val=value;
	}
	
	public static TreeNode createTree(int[] input){
		List<TreeNode> list=new ArrayList<TreeNode>();
		TreeNode tree=new TreeNode(0);
		int i=1;
		if(input[0]==-1){
			return tree;
		}
		else{
			tree.val=input[0];
			//using list as a queue, enqueue this treenode
			list.add(tree);
			while(i<input.length){
				TreeNode node=list.remove(0);
				//insert left
				if(input[i]==0){
					i++;
				}else{
					TreeNode l=new TreeNode(input[i]);
					node.left=l;
					list.add(l);
					i++;
				}
				//insert right
				if(i<input.length){
					if(input[i]==0){
						i++;
					}else{
						TreeNode r=new TreeNode(input[i]);
						node.right=r;
						list.add(r);
						i++;
					}
				}
			}
		}	
		return tree;
    }
    
    public static void show_inorder(TreeNode root){
    	if(root==null){
    		return;
    	}
    	show_inorder(root.left);
    	System.out.print(root.val+",");
    	show_inorder(root.right);
    	
    }
    
    public static void show_preorder(TreeNode root){
    	if(root==null){
    		return;
    	}
    	
    	System.out.print(root.val+",");
    	show_preorder(root.left);
    	show_preorder(root.right);
    }
    public static void show_postorder(TreeNode root){
    	if(root==null){
    		return;
    	}
    	   	
    	show_postorder(root.left);
    	show_postorder(root.right);
    	System.out.print(root.val+",");
    }
    public static void show_right(TreeNode root){
    	if(root==null){
    		return;
    	}
    	TreeNode currentNode=root;
    	while(currentNode!=null){
    		System.out.print(currentNode.val+",");
    		currentNode=currentNode.right;
    	}
    }
}
