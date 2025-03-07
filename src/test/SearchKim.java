package test;

import java.util.Arrays;

public class SearchKim {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new String[]{"Jane", "Kim"}));
    }


    static class Solution {
        public String solution(String[] seoul) {

            String answer = "";
            for (int i = 0; i < seoul.length; i++) {
                if (seoul[i].equals("Kim")) {
                    answer = "김서방은 " + i + "에 있다";
                    break; // break; 추가 하면 끝까지 안돎
                }
            }
            return answer;
        }
    }
}
