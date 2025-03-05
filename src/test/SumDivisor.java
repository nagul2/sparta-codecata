package test;

class SumDivisor {
    public int sumDivisor(int num) {
        int answer = 0;
        for (int i = 1; i <= num / 2; i++) {
            boolean bool = num % i == 0;
            System.out.println("num % i = " + num % i);
            if (bool) {
                answer += i;
                System.out.println("i = " + i);
                System.out.println("answer = " + answer);
            }
        }

        answer += num;
        System.out.println("answer = " + answer);
        return answer;
    }
}