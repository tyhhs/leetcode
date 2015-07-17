import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Clone_Graph {

	/**
	 * @param args
	 */

	class UndirectedGraphNode {
		int label;
		List<UndirectedGraphNode> neighbors;

		UndirectedGraphNode(int x) {
			label = x;
			neighbors = new ArrayList<UndirectedGraphNode>();
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		if(node==null){
			return null;
		}
		//use a queue to implement BFS
		Queue<UndirectedGraphNode> queue=new LinkedList<UndirectedGraphNode>();
		//use a map to store which node has been copied
		Map<UndirectedGraphNode, UndirectedGraphNode> map=
				new HashMap<UndirectedGraphNode, UndirectedGraphNode>();
		UndirectedGraphNode res=new UndirectedGraphNode(node.label);
		//put the first node into queue
		queue.add(node);
		//record node had been copied
		map.put(node, res);
		while(!queue.isEmpty()){
			UndirectedGraphNode currNode=queue.poll();
			List<UndirectedGraphNode> neighbors=currNode.neighbors;
			for(UndirectedGraphNode neighbor:neighbors){
				if(!map.containsKey(neighbor)){//if it hasn't been copied
					UndirectedGraphNode copy=new UndirectedGraphNode(neighbor.label);
					map.get(currNode).neighbors.add(copy);
					queue.add(neighbor);
					map.put(neighbor,copy);
				}
				else{
					map.get(currNode).neighbors.add(map.get(neighbor));
				}
			}
		}
		return res;
		
	}
}
