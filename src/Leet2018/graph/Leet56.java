package Leet2018.graph;

import java.util.*;

/**
 * TLE
 * @author bjxujiayi
 * @create 2018-10-22 12:17
 **/
public class Leet56 {

    public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
    }

    public static void main(String[] args) {

    }
    private Map<Interval, List<Interval>> graph = new HashMap<Interval, List<Interval>>();
    private Map<Integer, List<Interval>> nodes = new HashMap<Integer, List<Interval>>();
    private Set<Interval> visited = new HashSet<Interval>();
    public List<Interval> merge(List<Interval> intervals) {
        buildGraph(intervals);
        buildNode(intervals);
        List<Interval> merged = new ArrayList<Interval>();
        for(List<Interval> list : nodes.values()){
            merged.add(mergeNode(list));
        }
        return merged;
    }

    private Interval mergeNode(List<Interval> list) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(Interval interval : list){
            min = Math.min(min, interval.start);
            max = Math.max(max, interval.end);
        }
        return new Interval(min, max);
    }

    private void buildNode(List<Interval> intervals) {
        int comp = 0;
        for(Interval interval : intervals){
            if(!visited.contains(interval)){
                markAndDFS(interval, comp);
                comp ++;
            }
        }
    }

    private void markAndDFS(Interval interval, int comp) {
        Stack<Interval> stack = new Stack<Interval>();
        stack.push(interval);
        while(!stack.isEmpty()){
            Interval interval1 = stack.pop();
            if(!visited.contains(interval1)){
                visited.add(interval1);
                if(!nodes.containsKey(comp)){
                    nodes.put(comp, new LinkedList<Interval>());
                }
                nodes.get(comp).add(interval1);
            }
            for(Interval child : graph.get(interval1)){
                stack.push(child);
            }
        }
    }

    private void buildGraph(List<Interval> intervals) {
        for(Interval interval1 : intervals){
            for(Interval interval2 : intervals){
                if(overlap(interval1, interval2)){
                    if(graph.get(interval1) != null){
                        graph.put(interval1, new LinkedList<Interval>());
                    }
                    if(graph.get(interval2) != null){
                        graph.put(interval2, new LinkedList<Interval>());
                    }
                    graph.get(interval1).add(interval2);
                    graph.get(interval2).add(interval1);
                }
            }
        }
    }

    private boolean overlap(Interval interval1, Interval interval2) {
        return interval1.start <= interval2.end && interval1.end >= interval2.start;
    }
}
