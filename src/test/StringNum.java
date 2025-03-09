package test;

public class StringNum {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.solution("a234");
        solution.solution("1234");
    }

    static class Solution {
        public boolean solution(String s) {

            if (s.length() != 4 && s.length() != 6) {
                return false;
            }

            char[] charArr = s.toCharArray();
            for (char c : charArr) {
                if (c - 48 > 10) {
                    System.out.println("c = " + c);
                    return false;
                }
                System.out.println("c = " + c);

            }

            return true;
        }
    }
}
