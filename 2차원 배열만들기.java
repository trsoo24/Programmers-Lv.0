// num_list가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고 n이 2이므로 num_list를 2 * 4 배열로 다음과 같이 변경합니다.
// 2차원으로 바꿀 때에는 num_list의 원소들을 앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n]; // num_list.length = 8 , n = 2 일 경우 answer = [[0, 0],[0, 0],[0, 0],[0, 0]]
        int a = 0;
        for(int i = 0; i < num_list.length / n; i++) {
            for(int j = 0; j < n; j++) { 
                answer[i][j] = num_list[a];
                a++;
            }
        }
        return answer;
    }
}
