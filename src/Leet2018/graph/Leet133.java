package Leet2018.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bjxujiayi
 * @create 2018-11-23 10:13
 **/
public class Leet133 {
    class UndirectedGraphNode {
       int label;
       List<UndirectedGraphNode> neighbors;
      UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
    };
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if(node == null){
            return null;
        }
        Map<UndirectedGraphNode, UndirectedGraphNode> cloneMap =
                new HashMap<UndirectedGraphNode,UndirectedGraphNode>();
        return clone(node, cloneMap);
    }

    private UndirectedGraphNode clone(UndirectedGraphNode node, Map<UndirectedGraphNode,UndirectedGraphNode> cloneMap) {
        if(cloneMap.containsKey(node)){
            return cloneMap.get(node);
        }
        UndirectedGraphNode cloneNode = new UndirectedGraphNode(node.label);
        cloneMap.put(node, cloneNode);
        for(UndirectedGraphNode node1 : node.neighbors){
            cloneNode.neighbors.add(clone(node1, cloneMap));
        }
        return cloneNode;
    }
}
