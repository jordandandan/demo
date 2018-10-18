package Leet2018.string;

import java.util.Arrays;

/**
 * @author bjxujiayi
 * @create 2018-10-09 13:46
 **/
public class Leet6 {
    public String convert(String s, int numRows) {
        if(s==null||numRows==1)
            return s;
        int dir = 1;//1:+ -1:+
        int row = 0;
        String[] res = new String[numRows];
        Arrays.fill(res,"");
        for(int i=0;i<s.length();i++){
            res[row] += s.charAt(i);
            row+=dir;
            if(row>=numRows){
                dir = -1;
                row -= 2;
            }
            if(row<0){
                dir = 1;
                row = 1;
            }
        }
        String z = "";
        for(int i=0;i<res.length;i++){
            z += res[i];
        }
        return z;
    }
}
