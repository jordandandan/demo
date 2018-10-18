package Leet2018.twopointers;

/**
 * @author bjxujiayi
 * @create 2018-10-08 21:13
 **/
public class Leet3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        boolean[] map = new boolean[256];
        int i =0, max = 0;

        for(int j =0;j<s.length();j++){
            while(map[s.charAt(j)]){
                map[s.charAt(i)] = false;
                i++;
            }
            map[s.charAt(j)] = true;
            max = Math.max(max, j - i + 1);
        }
        return max;
    }

}
