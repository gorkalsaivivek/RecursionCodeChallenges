package src;

import java.util.Stack;

public class RemoveAdjacentDuplicates {
    StringBuilder stringBuilder=new StringBuilder();
    Stack<Character> stack = new Stack<Character>();


    String remove(String s) {
        // code here
        StringBuilder str;

        while (true) {
            str = new StringBuilder();
            int end = 0, n = s.length();

            while (end < n) {
                char currentChar = s.charAt(end);

                int start = end;
                while (end < n && currentChar == s.charAt(end)) {
                    end++;
                }

                if (end - start == 1) {
                    str.append(currentChar);
                }
            }

            s = str.toString();
            if (n == s.length()) {
                break;
            }
        }

        return s;
    }
}

class RemoveAdjacentDuplicatesStarter {
    public static void main(String[] args) {
        RemoveAdjacentDuplicates removeAdjacentDuplicates=new RemoveAdjacentDuplicates();
        System.out.println(removeAdjacentDuplicates.remove("abccbccba"));
    }
}