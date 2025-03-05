package test;

public class NumberPlus {
    public int solution(int n) {
        int answer = 0;

        while (!(n / 10 == 0)) {
            answer += (n % 10);
            System.out.println("n " + n);
            n /= 10;
        }
        answer += n;
        return answer;
    }
}
