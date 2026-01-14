package DataStructure.String;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if(ch == ' ') {
                if(!temp.isEmpty()) {
                    //TO-SEE: this condition - we do not have to append space at the end.
                    // When ans is empty, we will not append space
                    if(!ans.isEmpty()) {
                        temp.append(" ");
                    }
                    temp.append(ans);
                    ans = temp;
                    temp = new StringBuilder();
                }
            } else {
                temp.append(ch);
            }
        }

        //TO-SEE: this entire block - to append the last word as it will get terminated before appending
        if(!temp.isEmpty()) {
            if(!ans.isEmpty()) {
                temp.append(" ");
            }
            temp.append(ans);
            ans = temp;
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String a = "welcome to the jungle";
        System.out.println(reverseWords(a));
    }
}
