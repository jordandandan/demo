package Leet2018.graph;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bjxujiayi
 * @create 2018-11-26 10:04
 **/
public class Leet138 {
    class RandomListNode {
       int label;
       RandomListNode next, random;
       RandomListNode(int x) { this.label = x; }
   }

    /**
     * Recursive solution
     * O(N) Time O(N) Space
     * @param head
     * @return
     */
    public RandomListNode copyRandomListRecursive(RandomListNode head) {
        if(null == head)
            return null;
        Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
        return clone(head, map);
    }

    private RandomListNode clone(RandomListNode head, Map<RandomListNode,RandomListNode> map) {
        if(map.containsKey(head)){
            return map.get(head);
        }
        RandomListNode copy = new RandomListNode(head.label);
        map.put(head, copy);
        if(head.next != null)
            copy.next = clone(head.next, map);
        if(head.random != null)
            copy.random = clone(head.random, map);
        return copy;
    }
}
