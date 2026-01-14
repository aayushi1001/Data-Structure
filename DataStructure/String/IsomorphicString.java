package DataStructure.String;

import java.util.HashMap;

public class IsomorphicString {

    public boolean isomorphicString(String s, String t) {
        int[] m1 = new int[256], m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) {
                return false;
            }
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }

        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapping = new HashMap<>();
        for(int i=0; i<s.length(); ++i) {
            if(mapping.containsKey(s.charAt(i))) {
                Character ch = mapping.get(s.charAt(i));
                if(t.charAt(i) != ch) {
                    return false;
                }
            } else {
                // TO-SEE: This condition - key doesn't exist but value does
                // This takes O(n) time
                if(mapping.containsValue(t.charAt(i))) {
                    return false;
                }
                mapping.put(s.charAt(i), t.charAt(i));
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("badc", "baba"));

        String a = "dhsjb";
        String b = "dbfh";
        System.out.println(a + b);
    }
}
