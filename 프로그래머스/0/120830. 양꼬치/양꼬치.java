class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int n_cnt = 0;
        int s_cnt = 0;
        
        n_cnt = n/10;
        s_cnt = k-n_cnt;
        
        answer = (n*12000) + (s_cnt*2000);
        return answer;
    }
}