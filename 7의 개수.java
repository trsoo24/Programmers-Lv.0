// 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String seven = String.valueOf(array[i]);
            for (int j = 0; j < seven.length(); j++) {
                if (seven.charAt(j) == '7') {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}
