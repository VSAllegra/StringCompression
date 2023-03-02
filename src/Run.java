package src;

public class Run {

    public static void main(String[] args){
        Solution s = new Solution();
        char[] c = {'a','a','a','b','b','b','c','c','c','c'};
        int x = s.compress(c);
        System.out.print(x);
    }

}
