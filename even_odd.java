class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;
        int even = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        
        return answer;
    }
}

//    다른 풀이 ( answer 0 1 에 짝수 / 홀수를 담을 수 있다
// class Solution {
//     public int[] solution(int[] num_list) {
//         int[] answer = new int[2];

//         for(int i = 0; i < num_list.length; i++)
//             answer[num_list[i] % 2]++;

//         return answer;
//     }
// }
