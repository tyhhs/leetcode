import java.util.ArrayList;
import java.util.List;


public class Kth_Smallest_Element_in_a_BST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={4,2,6,1,3,5,7};
		TreeNode root=tree_function.buildTree(input);
		System.out.println(new Kth_Smallest_Element_in_a_BST().kthSmallest(root, 3));
	}
	public int kthSmallest(TreeNode root, int k) {
		int leftSize=calculateTreeSize(root.left);
		if(leftSize==k-1){
			return root.val;
		}
		else if (leftSize>=k) {
			return kthSmallest(root.left, k);
		}
		else{
			return kthSmallest(root.right, k-leftSize-1);
		}
	}
	
	int calculateTreeSize(TreeNode root){
		if(root==null){
			return 0;
		}
		return 1+calculateTreeSize(root.left)+calculateTreeSize(root.right);
	}
	
	 
	 //Time limited mothed, insert sort to sort the tree nodes in a list, then return the kth element
	/*static List<Integer> list=new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={1,2,3,4,5,6,7};
		TreeNode root=tree_function.buildTree(input);
		System.out.println(new Kth_Smallest_Element_in_a_BST().kthSmallest(root, 3));
	}
	
    public int kthSmallest(TreeNode root, int k) {
        DFS(root);
        return list.get(k-1);
    }
    
    void DFS(TreeNode root){
    	if(root==null){
    		return;
    	}
    	DFS(root.left);
    	insertSort(root.val);
    	DFS(root.right);
    }
    void insertSort(int a){
    	if(!list.isEmpty()&&a<list.get(0)){
    		list.add(0,a);
    		return;
    	}
    	for(int i=0;i<list.size()-1;i++){
    		if(a>list.get(i)&&a<list.get(i+1)){
    			list.add(i+1, a);
    			return;
    		}
    	}
    	list.add(a);
    }*/
}
