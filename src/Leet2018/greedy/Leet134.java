package Leet2018.greedy;

/**
 * http://www.cnblogs.com/boring09/p/4248482.html
 * @author bjxujiayi
 * @create 2018-11-23 10:48
 **/
public class Leet134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int remain = 0, debt = 0, start = 0;
        for(int i = 0; i< gas.length; i++){
            remain += gas[i] - cost[i];
            if(remain < 0){
                debt += remain;
                start = i + 1;
                remain = 0;
            }
        }
        return remain + debt >= 0? start : -1;
    }
}
