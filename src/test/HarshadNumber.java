package test;

public class HarshadNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("10 = " + solution.solution(10));
        System.out.println("11 = " + solution.solution(11));
        System.out.println("12 = " + solution.solution(12));
        System.out.println("13 = " + solution.solution(13));
        System.out.println("100 = " + solution.solution(100));
        System.out.println("101 = " + solution.solution(101));

    }

    static class Solution {
        public boolean solution(int x) {

            String str = "" + x;
            int[] array = str.chars().map(num -> Character.getNumericValue(num)).toArray();
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return x % sum == 0;
        }
    }
}
