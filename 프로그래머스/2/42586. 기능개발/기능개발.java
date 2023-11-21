import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //int[] answer = {};
        
        Queue queue = new LinkedList();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++) {
            int day = 0;
            while ( progresses[i] < 100) {
                progresses[i] += speeds[i];
                day++;
            }
            queue.add(day);
        }
        //System.out.println(queue);
        int temp = 0; //완료된 날짜
        int cnt = 0; //날짜에 배포 가능한 개수
        
        temp = Integer.parseInt(queue.remove().toString());
        cnt++;
        
        while (queue.size() > 0) {
            if(temp >= Integer.parseInt(queue.peek().toString())) {
                queue.remove();
                cnt++;
            } else {
                temp = Integer.parseInt(queue.remove().toString());
                list.add(cnt);
                cnt = 1;
            }
            
            if(queue.size() == 0)
                list.add(cnt);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i).intValue();
        }
        
        
        
        return answer;
    }
}