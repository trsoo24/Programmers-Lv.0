class Solution {
    public int solution(int[] numbers) {
        int answer = Integer.MIN_VALUE; 
        // int[] numbers 원소가 2개 뿐이고, 매우 큰 음수일 경우를 대비해 Integer.MIN_VALUE 로 초기화
        int a = 0;
        for(int i = 0; i < numbers.length; i++) { 
            for(int j = i+1; j < numbers.length; j++) {
                a = numbers[i] * numbers[j];
                if (a > answer) {
                    answer = a;
                }
            }
        }
        return answer;
    }
}
