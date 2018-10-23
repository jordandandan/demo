package Leet2018.string;

import java.util.*;

/**
 * @author bjxujiayi
 * @create 2018-10-19 11:02
 **/
public class Leet49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map =new HashMap<String, List<String>>();
        for(String str : strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);
            if(!map.containsKey(key)){
                List<String> temp = new ArrayList<String>();
                temp.add(str);
                map.put(key,temp);
            }else{
                map.get(key).add(str);
            }
        }
        return new ArrayList<List<String>>(map.values());
    }
}
