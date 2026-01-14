package DataStructure.String;

public class RemoveOutermostParantheses {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (count > 0) {
                    ans.append(ch);
                }
                count++;
            } else {
                count--;
                if (count > 0) {
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        RemoveOutermostParantheses a = new RemoveOutermostParantheses();
        System.out.println(a.removeOuterParentheses("(()())(())"));
    }
}
