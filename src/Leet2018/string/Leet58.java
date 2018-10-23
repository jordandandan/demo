package Leet2018.string;

/**
 * @author bjxujiayi
 * @create 2018-10-23 10:18
 **/
public class Leet58 {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] words = s.split(" ");
        if(words.length == 0)
            return  0 ;
        return words[words.length -1].length();
    }
}
