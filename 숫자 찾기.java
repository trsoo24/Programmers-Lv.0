// 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int a = 0;
        for(int i = num; i > 0; i /= 10){
            a++;
        }
        
        int[] arr = new int[a];
        int b = arr.length - 1;
        
        for(int i = num; i > 0; i /= 10){
            arr[b] = (i % 10) ;
            b--;
        }
        
        for(int j = 0; j < arr.length; j++){
            if(arr[j] == k){
                answer = j + 1;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}
