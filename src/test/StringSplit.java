package test;

public class StringSplit {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("abcde = " + solution.solution("abcde"));
        System.out.println("qwer = " + solution.solution("qwer"));



    }

    static class Solution {
        public String solution(String s) {
            StringBuilder sb = new StringBuilder(s);

            String answer = "";
            if (s.length() % 2 == 0) {
                answer = sb.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
            } else {
                answer = sb.substring((s.length() / 2), (s.length() / 2) + 1);
            }

            return answer;
        }
    }
}
