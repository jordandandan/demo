package Leet2018.sort;

import java.util.*;

/**
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
    public class IntervalComparator implements Comparator<Interval>{

        public int compare(Interval o1, Interval o2) {
            return o1.start<o2.start? -1 : o1.start == o2.start?0:1;
        }
    }
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());
        List<Interval> res = new LinkedList<Interval>();
        for(Interval interval : intervals){
            if(res.isEmpty() || ((LinkedList<Interval>) res).getLast().end < interval.start){
                res.add(interval);
            }else{
                ((LinkedList<Interval>) res).getLast().end = Math.max(((LinkedList<Interval>) res).getLast().end
                        ,interval.end);
            }
        }
        return res;
    }
}
