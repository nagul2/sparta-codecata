package test;

public class NumberHide {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(\"01033334444\") = " + solution.solution("01033334444"));
        System.out.println("solution.solution(\"027778888\") = " + solution.solution("027778888"));
    }
    static class Solution {
        public String solution(String phone_number) {

            int numberLength = phone_number.length();
            int starLength = numberLength - 4;
            StringBuilder star = new StringBuilder();
            for (int i = 0; i < starLength; i++) {
                star.append("*");
            }

            String lastNumber = phone_number.substring(starLength);
            return star + lastNumber;
        }
    }

}

