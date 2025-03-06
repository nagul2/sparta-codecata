package test;

public class reverseNumSave {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(1234567890);
    }

    static class Solution {
        public int[] solution(long n) {
            String numStr = String.valueOf(n);
            StringBuilder sb = new StringBuilder(numStr);
            int[] array = sb.reverse().chars().map(num -> Character.getNumericValue(num)).toArray();

            System.out.println("sb = " + sb);
            return array;
        }
    }
}
