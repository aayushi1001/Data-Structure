package DataStructure.String;

public class LargestOddNumber {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<strs[0].length(); ++i) {
            boolean flag = true;
            for(int j=1; j<strs.length; ++j) {
                if( strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if(flag) {
                ans.append(strs[0].charAt(i));
            } else {
                break;
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

    }
}
