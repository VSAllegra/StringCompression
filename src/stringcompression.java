package src;
import java.util.ArrayList;

class Solution {
    public int compress(char[] chars) {
        ArrayList<String> s = new ArrayList<String>();
        char cur_char = chars[0];
        int input_len = chars.length;
        int counter = 1;
        for(int i = 1; i < input_len; i++){
            if(cur_char == chars[i]){
                counter++;
            } else {
                s.add(String.valueOf(cur_char));
                if(counter > 1){s.add(String.valueOf(counter));}
                counter = 1; 
                cur_char = chars[i];
            }
        }

        s.add(String.valueOf(cur_char));
        if(counter > 1){s.add(String.valueOf(counter));}

        System.out.print(s);
        return s.size(); 

    }
}


