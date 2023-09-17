package algorithms.leetcode.easy;

public class BackSpaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        String string1 = checkAfterBackspacing(s);
        String string2 = checkAfterBackspacing(t);
        return (string1.equals(string2));
    }

    public static String checkAfterBackspacing(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!='#'){
                sb.append(ch);
            } else if(sb.length()!=0)
                sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}
